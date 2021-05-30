package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@Autowired
	public ConfigurationMetadataStudyForCollectionProps cmsfcp;
	
	@Autowired
	public ConfigurationMetadataStudyForNormalProps cmsfnp;
	
	@GetMapping("/testProps")
	public ModelAndView testProps(ModelAndView mav) {
		System.out.println("test Colors instance : " + cmsfcp.getColors().toString());
		System.out.println("test Colors size : " + cmsfcp.getColors().size());

		mav.setViewName("index");
		mav.addObject("ColorsInstance",cmsfcp.getColors());
		mav.addObject("ColorsSize",cmsfcp.getColors().size());

		return mav;		
	}
}
