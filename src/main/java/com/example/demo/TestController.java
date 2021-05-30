package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@Autowired
	public ConfigurationMetadataStudyForCollectionProps cmsfcp;
	
	@Autowired
	public ConfigurationMetadataStudyForNormalProps cmsfnp;
	
	@GetMapping("/testProps")
	public String test() {
		System.out.println("test Colors isntance : " + cmsfcp.getColors().toString());
		System.out.println("test Colors size : " + cmsfcp.getColors().size());

		return "index";
	}
}
