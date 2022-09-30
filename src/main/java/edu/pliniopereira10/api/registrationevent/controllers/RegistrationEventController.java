package edu.pliniopereira10.api.registrationevent.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@PostMapping("/registration-events")
	public String form(EventModel eventModel) {
		eventService.save(eventModel);

		return "redirect:registration-events";
	}

	@GetMapping("/registration-events")
	public String form() {
		return "event/formEvents";
	}

	@GetMapping("/list-events")
	public ModelAndView events() {
		ModelAndView modelAndView = new ModelAndView("/event/listEvents");
		List<EventModel> events = eventService.findAll();
		modelAndView.addObject("events", events);

		return modelAndView;
	}

	@GetMapping("/list-events/{id}")
	public ModelAndView eventDetail(@PathVariable("id") long id) {
		Optional<EventModel> eventModelOptional = eventService.findById(id);
		ModelAndView modelAndView = new ModelAndView("/event/eventsDetails");
		modelAndView.addObject("eventDetail", eventModelOptional);

		return modelAndView;
	}

}
