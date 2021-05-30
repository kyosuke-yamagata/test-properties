package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "test-app.colors")
@Validated
public class ConfigurationMetadataMapStudy {

	private static List<Color> color = new ArrayList<>();
	
	public List<Color> getColor() {
		return color;
	}

	public static void setColor(String color) {
		System.out.println("color : " + color);
		ConfigurationMetadataMapStudy.color.add(Color.valueOf(color));
	}
}
