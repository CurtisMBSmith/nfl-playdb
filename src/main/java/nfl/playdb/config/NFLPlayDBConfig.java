package nfl.playdb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("nfl.playdb.dao")
@PropertySource(value={"file:config/playdb/playdb.properties"})
@EnableTransactionManagement
public abstract class NFLPlayDBConfig {

	@Autowired
	Environment env;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.driver}")
	private String driver;

	@Value("${jooq.dialect}")
	private String dialect;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public DataSource dataSource() throws Exception {
		final Properties props = new Properties();
		props.put("url", this.url);
		props.put("username", this.username);
		props.put("password", this.password);
		props.put("driverClassName", this.driver);
		final DataSource ds = BasicDataSourceFactory.createDataSource(props);

		return ds;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() throws Exception {
		final DataSourceTransactionManager txnMgr = new DataSourceTransactionManager(dataSource());
		return txnMgr;
	}

	@Bean
	public TransactionAwareDataSourceProxy transactionAwareDataSource() throws Exception {
		final TransactionAwareDataSourceProxy txnAwareDSProxy = new TransactionAwareDataSourceProxy(dataSource());
		return txnAwareDSProxy;
	}

	@Bean
	public DataSourceConnectionProvider connectionProvider() throws Exception {
		return new DataSourceConnectionProvider(dataSource());
	}

	@Bean
	public org.jooq.Configuration jooqConfig() throws Exception {
		final org.jooq.Configuration conf = new DefaultConfiguration();
		conf.set(SQLDialect.valueOf(dialect));
		conf.set(connectionProvider());

		return conf;
	}

	@Bean
	public DSLContext dsl() throws Exception {
		return new DefaultDSLContext(jooqConfig());
	}
}
