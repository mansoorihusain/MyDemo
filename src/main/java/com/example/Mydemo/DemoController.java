package com.example.Mydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("/userDetails")
	public String test(ViewDemo demo) {
		System.out.println(demo.getUsername());
		System.out.println(demo.getPassword());
		System.out.println(demo.getEmail());
		return "index.jsp";
	}

}
