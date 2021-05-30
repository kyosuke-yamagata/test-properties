package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMetadataConfig {
	@Bean
	public ConfigurationMetadataStudyMapProperties cmms() {
		return new ConfigurationMetadataStudyMapProperties();
	}
	
	@Bean
	public ConfigurationMetadataStudy cms() {
		return new ConfigurationMetadataStudy();
	}
}
