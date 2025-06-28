package org.jsp.event.repository;



import org.jsp.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Long> {}


