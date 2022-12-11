package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	
	@RequestMapping("/home")
	public String home() {
		
		
		return "Home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("s")String query) {
		
		RedirectView redirectView=new RedirectView();
		
		if(query.isBlank()) {
			redirectView.setUrl("home");
		}
		else
		{
		String urlString="https://www.google.com/search?q="+query;
		
		  redirectView.setUrl(urlString);
		}
		return redirectView;
		
	}
}
