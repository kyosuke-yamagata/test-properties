package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMetadataConfig {
	@Bean
	public ConfigurationMetadataMapStudy cmms() {
		return new ConfigurationMetadataMapStudy();
	}
}
