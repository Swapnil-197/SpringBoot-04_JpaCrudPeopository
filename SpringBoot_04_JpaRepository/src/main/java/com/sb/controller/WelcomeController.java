package com.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.constants.GlobalConstants;

@RestController 
public class WelcomeController {

	@GetMapping(GlobalConstants.ROOT_MAPPING)
	public String getMessage() {
		return GlobalConstants.WELCOME_MESSAGE;
	}
}
