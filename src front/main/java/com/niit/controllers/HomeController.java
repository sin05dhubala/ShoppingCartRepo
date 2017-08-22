package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.Service.ProductService;

@Controller

public class HomeController {
	
	
	@Autowired
	private ProductService productService;
	HomeController()
	{
		System.out.println("gud evening");
	}
@RequestMapping("/")
public String homepage(HttpSession session) {
	 session.setAttribute("categories",productService.getAllCategories());
	 return "home";
	   
} 
	@RequestMapping("/signup")
	public String SignUp()
	{
		return "signup";
	}
	
	
	@RequestMapping("/login")
	public String Login(@RequestParam (required=false) String error,Model model)
	{
		if(error!=null)
			model.addAttribute("error","Invalid username/password");
		return "login";
	}
	@RequestMapping("/admin")
	public String Adminpage()
	{
		return "admin";
	}
	@RequestMapping("/contactus")
	public String Contactus()
	{
		return "contactus";
	}
	@RequestMapping("/aboutus")
	public String Aboutus()
	{
		return "aboutus";
	}
	}
	



