package com.example.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello()	{
		return "hello";
	}
	
	@GetMapping("/hello2")
	public String hello2()	{
		return "hello";
	}
	@GetMapping("/hello4")
	public String hello4()	{
		return "hello";
	}
	
	
}