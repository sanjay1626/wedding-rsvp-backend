package com.company.weddingrsvpservice.viewmodel;

import com.company.weddingrsvpservice.model.RsvpGuests;

import java.util.List;
import java.util.Objects;

public class RsvpViewModel {
    private int id;
    private int guest_event_id;
    private RsvpGuests guests;
    private String eventName;
    private String location;
    private String guestEmail;
    private Boolean attending;

    public RsvpViewModel() {
    }

    public RsvpViewModel(int id, int guest_event_id, RsvpGuests guests, String eventName, String location, String guestEmail, Boolean attending) {
        this.id = id;
        this.guest_event_id = guest_event_id;
        this.guests = guests;
        this.eventName = eventName;
        this.location = location;
        this.guestEmail = guestEmail;
        this.attending = attending;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuest_event_id() {
        return guest_event_id;
    }

    public void setGuest_event_id(int guest_event_id) {
        this.guest_event_id = guest_event_id;
    }

    public RsvpGuests getGuests() {
        return guests;
    }

    public void setGuests(RsvpGuests guests) {
        this.guests = guests;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Boolean getAttending() {
        return attending;
    }

    public void setAttending(Boolean attending) {
        this.attending = attending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RsvpViewModel that = (RsvpViewModel) o;
        return id == that.id && guest_event_id == that.guest_event_id && Objects.equals(guests, that.guests) && Objects.equals(eventName, that.eventName) && Objects.equals(location, that.location) && Objects.equals(guestEmail, that.guestEmail) && Objects.equals(attending, that.attending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guest_event_id, guests, eventName, location, guestEmail, attending);
    }

    @Override
    public String toString() {
        return "RsvpViewModel{" +
                "id=" + id +
                ", guest_event_id=" + guest_event_id +
                ", guests=" + guests +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                ", attending=" + attending +
                '}';
    }
}