package org.jsp.event.service;

import java.util.List;

import org.jsp.event.model.Event;
import org.jsp.event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
	public class EventService {
	    @Autowired
	    private EventRepository repo;

	    public Event createEvent(Event event) {
	        return repo.save(event);
	    }

	    public List<Event> getAllEvents() {
	        return repo.findAll(Sort.by("startTime"));
	    }

	    public Event updateEvent(Long id, Event updatedEvent) {
	        Event event = repo.findById(id).orElseThrow();
	        event.setTitle(updatedEvent.getTitle());
	        event.setDescription(updatedEvent.getDescription());
	        event.setStartTime(updatedEvent.getStartTime());
	        event.setEndTime(updatedEvent.getEndTime());
	        return repo.save(event);
	    }

	    public void deleteEvent(Long id) {
	        repo.deleteById(id);
	    }
	}

