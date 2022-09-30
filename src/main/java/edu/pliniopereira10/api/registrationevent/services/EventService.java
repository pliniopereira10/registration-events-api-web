package edu.pliniopereira10.api.registrationevent.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pliniopereira10.api.registrationevent.models.EventModel;
import edu.pliniopereira10.api.registrationevent.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	@Transactional
	public Object save(EventModel eventModel) {
		return eventRepository.save(eventModel);
	}

	public List<EventModel> findAll() {
		return eventRepository.findAll();
	}

	public Optional<EventModel> findById(long id) {
		return eventRepository.findById(id);
	}

}
