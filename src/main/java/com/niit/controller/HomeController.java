package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	@RequestMapping("/products")
	public String products()
	{
		return "products";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/logsuccess")
	public String loginSuccess()
	{
		return "logsuccess";
	}
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	@RequestMapping("/regsuccess")
	public String registerSuccess()
	{
		return "regsuccess";
	}
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus";
	}


}
