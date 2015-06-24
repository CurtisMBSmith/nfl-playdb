package nfl.playdb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@ComponentScan("nfl.playdb")
@PropertySource(value={"file:config/playdb/playdb.properties"})
@EnableTransactionManagement
public class NFLPlayDBConfig {

	@Autowired
	Environment env;

	@Bean
	public PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public DataSource dataSource(@Value("${spring.datasource.url}") final String url,
			@Value("${spring.datasource.username}") final String username,
			@Value("${spring.datasource.password}") final String password,
			@Value("${spring.datasource.driver}") final String driver) throws Exception {
		final Properties props = new Properties();
		props.put("url", url);
		props.put("username", username);
		props.put("password", password);
		props.put("driverClassName", driver);
		final DataSource ds = BasicDataSourceFactory.createDataSource(props);

		return ds;
	}
}
