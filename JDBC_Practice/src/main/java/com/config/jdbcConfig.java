package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;




@Configuration
public class jdbcConfig {
	
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setUrl("jdbcUrljdbc:mysql://localhost:3306/jdbc");
	        dataSource.setUsername("root");
	        dataSource.setPassword("Mycompany:DXC5");
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        return dataSource;
	    }

	    @Bean
	    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	        return new JdbcTemplate(dataSource);
	    }
	}