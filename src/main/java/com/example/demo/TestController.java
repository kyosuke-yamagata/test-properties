package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@Autowired
	public ConfigurationMetadataStudyMapProperties cmms;
	
	@GetMapping("/test")
	public String test() {
		System.out.println("test Colors isntance : " + cmms.getColors().toString());
		System.out.println("test Colors size : " + cmms.getColors().size());

		return "index";
	}
}
