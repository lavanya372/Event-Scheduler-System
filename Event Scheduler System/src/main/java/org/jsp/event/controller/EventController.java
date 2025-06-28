package org.jsp.event.controller;

import java.util.List;

import org.jsp.event.model.Event;
import org.jsp.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/api/events")
	public class EventController {
	    @Autowired
	    private EventService service;

	    @PostMapping
	    public ResponseEntity<Event> add(@RequestBody Event event) {
	        return ResponseEntity.ok(service.createEvent(event));
	    }

	    @GetMapping
	    public ResponseEntity<List<Event>> getAll() {
	        return ResponseEntity.ok(service.getAllEvents());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Event> update(@PathVariable Long id, @RequestBody Event event) {
	        return ResponseEntity.ok(service.updateEvent(id, event));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> delete(@PathVariable Long id) {
	        service.deleteEvent(id);
	        return ResponseEntity.ok().build();
	    }
	}

