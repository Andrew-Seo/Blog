package com.goggle.real;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class default_controller {
	@RequestMapping("/")
	String page1() {
		return "index";
	}
}
