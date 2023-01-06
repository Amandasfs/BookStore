package com.BookStore.Amanda.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.BookStore.Amanda.service.BDService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private BDService bdService;
	
	@Bean
	public void instanciaBaseDeDados() {
		this.bdService.instanciaBaseDeDados();
	}
}
