package com.itb.assistencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assistencia/v1")
public class AssistenciaController {
	
	
		@GetMapping("/login")
		public String login() {
			
			return "login";
		}
		
		

}
