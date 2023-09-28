package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

@Repository
public class EventRepository {

    private final List<Event> events = List.of(
        new Event(
            501,
            "Spring Boot Conf 2021",
            new Organizer(101, "Pluralsight", "Pluralsight"),
            new Venue(201, "Globomatics Main Office", "uptown", "Test Street 325", "New York", "New York", "USA", "10001"),
            LocalDate.of(2021, 10, 1),
            LocalDate.of(2021, 10, 2)
        ),
        new Event(
            502,
            "Spring Boot Conf 2022",
            new Organizer(101, "Pluralsight", "Pluralsight"),
            new Venue(201, "Globomatics", "uptown", "Test Street 325", "New York", "New York", "USA", "10001"),
            LocalDate.of(2022, 10, 1),
            LocalDate.of(2022, 10, 2)
        ),
        new Event(
            503,
            "Spring Boot Conf 2023",
            new Organizer(102, "Google", "Google LLC"),
            new Venue(202, "Sea View Hotel", "downtown", "Beach Boulevard 863", "Los Angeles", "California", "USA", "90001"),
            LocalDate.of(2023, 10, 1),
            LocalDate.of(2023, 10, 2)));
    
    public List<Event> findByOrganizerId(int organizerId) {
        return events.stream().filter(event -> event.organizer().id() == organizerId).toList();
    }

    public Optional<Event> findById(int id) {
        return events.stream().filter(event -> event.id() == id).findAny();

    }
    
}
