package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Myuser;
import com.demo.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginservice;
	
		
	@GetMapping("/login")
	public String loginpage() {
		return "loginpage";
	}
	
	@PostMapping("/validate")
	public ModelAndView validateuser(HttpSession session,@RequestParam  String name,@RequestParam  String password) {
		Myuser m1=loginservice.validate(name,password);
		if(m1!=null) {
			session.setAttribute("user", m1);
			return new ModelAndView("redirect:/product/showproduct");
		}else {
			return new ModelAndView("loginpage","msg","Invalid Login name or Password!");
		}
	}
	
}
