package nfl.playdb.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("nfl.playdb")
@PropertySource(value={"classpath:playdb.properties"})
@EnableJpaRepositories(basePackages={"nfl.playdb.dao"})
@EnableTransactionManagement
public class NFLDataAnalyzerConfig {

}
