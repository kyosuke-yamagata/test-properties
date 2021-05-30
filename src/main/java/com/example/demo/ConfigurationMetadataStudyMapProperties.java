package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "test-app")
@Validated
public class ConfigurationMetadataStudyMapProperties {

	private List<Color> colors = new ArrayList<>();
	
	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors=colors;
	}
	
	public void setColors(String color) {
		// does not work normally.
		// using for debug.
		System.out.println("for debug : " + color);
		colors.add(Color.valueOf(color));
	}
}
