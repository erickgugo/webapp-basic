package com.webapp.model;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
//@ConfigurationProperties(prefix = "datasource.apidb")
@PropertySource("classpath:application.properties")
public class CustomHikariConfig extends HikariConfig {

//    @Bean
//    public DataSource dataSource() {
//        return new HikariDataSource(this);
//    }

//    @Bean
//    @ConfigurationProperties("datasource.apidb")
//    public DataSourceProperties dataSourceProperties() {
//        return new DataSourceProperties();
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "datasource.apidb")
//    public HikariDataSource dataSource(DataSourceProperties properties) {
//        return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
//                .build();
//    }

    @Bean
    @Qualifier("dataSourceOctopus")
    @ConfigurationProperties(prefix = "datasource.apidb")
    public DataSource dataSourceOctopus() {
        return new HikariDataSource();
    }

}