package hmsystem.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

import hmsystem.models.enums.AvailabilityStatus;
import hmsystem.models.enums.TimeSlot;

public class Availability {

    private HashMap<TimeSlot, AvailabilityStatus> availableSlots;

    public Availability(HashMap<TimeSlot, AvailabilityStatus> availableSlots) {
        this.availableSlots = availableSlots;
    }

    // Getters
    public HashMap<TimeSlot, AvailabilityStatus> getAvailableSlots() {
        return availableSlots;
    }
}

Availability: doctorid, date, timeslot, status