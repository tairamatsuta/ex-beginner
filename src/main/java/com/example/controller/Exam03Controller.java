package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	private static final double TAX = 1.1;

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/input")
	public String input(String item1, String item2, String item3) {
		Integer item1Price = Integer.parseInt(item1);
		Integer item2Price = Integer.parseInt(item2);
		Integer item3Price = Integer.parseInt(item3);
		int taxFreePrice = item1Price + item2Price + item3Price;
		int totalPrice = (int) (taxFreePrice * TAX);
		application.setAttribute("taxFree", taxFreePrice);
		application.setAttribute("total", totalPrice);
		
		return "exam03-result";
	}
}
