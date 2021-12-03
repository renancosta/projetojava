package com.projecao.projetojava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {
	
	@RequestMapping("/")
	public String ola() {
		return "Olá Mundo";
	}

}
