package com.company.weddingrsvpservice.model;

import com.company.weddingrsvpservice.viewmodel.EventsViewModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="guest")
public class RsvpGuests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int event_id;
    @NotNull(message = "Please enter your full name.")
    @Column(name = "guest_id" )
    private Integer guestId;


    private String guestName;
    private String guestEmail;
    private Integer totalInvited;
    private Boolean attending;

    public RsvpGuests() {
    }

    public RsvpGuests(int id, int event_id, Integer guestId, String guestName, String guestEmail, Integer totalInvited, Boolean attending) {
        this.id = id;
        this.event_id = event_id;
        this.guestId = guestId;
        this.guestName = guestName;
        this.guestEmail = guestEmail;
        this.totalInvited = totalInvited;
        this.attending = attending;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Integer getTotalInvited() {
        return totalInvited;
    }

    public void setTotalInvited(Integer totalInvited) {
        this.totalInvited = totalInvited;
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
        RsvpGuests that = (RsvpGuests) o;
        return id == that.id && event_id == that.event_id && Objects.equals(guestId, that.guestId) && Objects.equals(guestName, that.guestName) && Objects.equals(guestEmail, that.guestEmail) && Objects.equals(totalInvited, that.totalInvited) && Objects.equals(attending, that.attending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, event_id, guestId, guestName, guestEmail, totalInvited, attending);
    }

    @Override
    public String toString() {
        return "RsvpGuests{" +
                "id=" + id +
                ", event_id=" + event_id +
                ", guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                ", totalInvited=" + totalInvited +
                ", attending=" + attending +
                '}';
    }
}
