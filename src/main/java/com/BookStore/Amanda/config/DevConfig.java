package com.BookStore.Amanda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.BookStore.Amanda.service.BDService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private BDService bdService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instanciaBaseDeDados() {
		if (strategy.equals("create")) {
			bdService.instanciaBaseDeDados();
		}
		return false;
	}

}
