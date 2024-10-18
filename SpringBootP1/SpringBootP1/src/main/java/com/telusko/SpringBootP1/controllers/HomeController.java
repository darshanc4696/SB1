package com.telusko.SpringBootP1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/alien")
	public String displayAlien(@RequestParam("name") String name, @RequestParam("email") String email, Model model)
	{
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		return "displayresult";
	}
	
	@RequestMapping("/**")
	public String notFound()
	{
		return "notfound";
	}

}
