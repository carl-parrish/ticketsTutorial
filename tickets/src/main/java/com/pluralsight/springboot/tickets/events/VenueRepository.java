package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {

    private final List<Venue> venues = List.of(
        new Venue(
            201,
            "Globomatics Main Office",
            "uptown",
            "Test Street 325",
             "New York",
             "New York",
             "USA",
            "10001"
            
        ),
        new Venue(
            202,
            "Sea View Hotel",
            "downtown",
            "Beach Boulevard 863",
             "Los Angeles",
             "California",
             "USA",
            "90001"));

    public Optional<Venue> findById(int id) {
        return venues.stream().filter(venue -> venue.id() == id).findAny();
    }
    
}
