package com.pluralsight.springboot.tickets.events;

public record Venue(
    int id,
    String name,
    String description,
    String streetAddress,
    String city,
    String state,
    String country,
    String postalCode
) {
    
}
