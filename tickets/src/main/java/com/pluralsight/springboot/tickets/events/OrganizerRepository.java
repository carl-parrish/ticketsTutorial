package com.pluralsight.springboot.tickets.events;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class OrganizerRepository {

   private final List<Organizer> organizers = List.of(
         new Organizer(101, "Pluralsight", "Pluralsight is the technology workforce development company that helps teams know more and work better together with stronger skills, improved processes and informed leaders."),
         new Organizer(102, "Google", "Google LLC is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, a search engine, cloud computing, software, and hardware."),
         new Organizer(103, "Microsoft", "Microsoft Corporation is an American multinational technology company with headquarters in Redmond, Washington. It develops, manufactures, licenses, supports, and sells computer software, consumer electronics, personal computers, and related services."),
         new Organizer(104, "Amazon", "Amazon.com, Inc. is an American multinational technology company based in Seattle, Washington, which focuses on e-commerce, cloud computing, digital streaming, and artificial intelligence."),
         new Organizer(105, "Apple", "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services.")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}