package edu.pliniopereira10.api.registrationevent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pliniopereira10.api.registrationevent.models.EventModel;

@Repository
public interface EventRepository extends JpaRepository<EventModel, Long> {

}
