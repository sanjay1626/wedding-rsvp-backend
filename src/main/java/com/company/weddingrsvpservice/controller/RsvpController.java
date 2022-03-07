package com.company.weddingrsvpservice.controller;

import com.company.weddingrsvpservice.model.RsvpEvent;
import com.company.weddingrsvpservice.model.RsvpGuests;
import com.company.weddingrsvpservice.repository.EventRepository;
import com.company.weddingrsvpservice.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Validated
public class RsvpController {

//    RsvpGuests guest = new RsvpGuests();

    public static List<RsvpEvent> eventsList = new ArrayList<>(Arrays.asList(
            new RsvpEvent(1, "Mehndi", "New York"),
            new RsvpEvent(2, "Sangeet", "Chicago"),
            new RsvpEvent(3, "Reception", "LA")
    ));

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private GuestRepository guestRepository;

    @GetMapping("/events/{email}")
    @ResponseStatus(value = HttpStatus.OK)
    public RsvpEvent findEvents(@PathVariable String email) {
        guestRepository.findAllGuestByEmail(email);

        return null;
    }


    @PostMapping("/rsvpEvent")
    @ResponseStatus(HttpStatus.CREATED)
    public RsvpEvent createEvent(@RequestBody @Valid RsvpEvent event){
        //guest.getGuest_event_id(event.getId());
        // guest.setGuest_event_id(event.getId());

         return eventRepository.save(event);
    }

    @PostMapping("/rsvpGuest")
    @ResponseStatus(HttpStatus.CREATED)
    public RsvpGuests createEvent(@RequestBody @Valid RsvpGuests guests){
        //guest.getGuest_event_id(event.getId());
        // guest.setGuest_event_id(event.getId());

        return guestRepository.save(guests);
    }






}
