package config;

import app.data.db.DataAccess;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackageClasses = {DataAccess.class},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        })
public class RootConfig {

        @Bean
        public DataSource dataSource() {
                DriverManagerDataSource ds = new DriverManagerDataSource();
                ds.setDriverClassName("com.mysql.jdbc.Driver");
                ds.setUrl("jdbc:mysql://localhost:3306/library");
                ds.setUsername("root");
                ds.setPassword("root");
                return ds;
        }
}
