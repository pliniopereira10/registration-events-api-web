package edu.pliniopereira10.api.registrationevent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pliniopereira10.api.registrationevent.models.EventModel;
import edu.pliniopereira10.api.registrationevent.services.EventService;

@Controller
public class RegistrationEventController {

	@Autowired
	private EventService eventService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/registration-events")
	public String form() {
		return "event/formEvent";
	}

	@PostMapping("/registration-events")
	public String form(EventModel eventModel) {
		eventService.save(eventModel);

		return "redirect:registration-events";
	}

}
