package edu.pliniopereira10.api.registrationevent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationEventController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

}
