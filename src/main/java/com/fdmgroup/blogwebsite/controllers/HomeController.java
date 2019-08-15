package com.fdmgroup.blogwebsite.controllers;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.blogwebsite.entity.User;

@Controller
public class HomeController {

//	@Autowired
//	EntityManagerFactory emf;
	
	@RequestMapping(value = "/")
	public String goToRegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "home";
	}
	
}
