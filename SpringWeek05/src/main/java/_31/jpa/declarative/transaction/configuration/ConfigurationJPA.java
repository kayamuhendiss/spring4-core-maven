package _31.jpa.declarative.transaction.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc/jpa.properties")
@ComponentScan("_31.jpa")
@EnableTransactionManagement
public class ConfigurationJPA {

	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(jdbcUrl);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(dataSource());
		factory.setJpaVendorAdapter(new EclipseLinkJpaVendorAdapter());
		factory.setPackagesToScan("_31.jpa.declarative.transaction.model");
		//factory.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");

		Map<String, String> jpaProperties = new HashMap<String, String>();
		jpaProperties.put("eclipselink.weaving", "false");
		jpaProperties.put("eclipselink.ddl-generation", "drop-and-create-tables");
		// <property name="eclipselink.ddl-generation" value="drop-and-create-tables" />
		// <property name="eclipselink.logging.level" value="OFF" />	</properties>

		factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		factory.setJpaPropertyMap(jpaProperties);
		return factory;
	}

	@Bean
	public JpaTransactionManager jpaTransactionManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return jpaTransactionManager;
	}

}
