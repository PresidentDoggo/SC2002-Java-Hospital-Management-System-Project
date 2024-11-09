package hmsystem.controllers;

import java.time.LocalDate;
import java.util.List;
import hmsystem.models.Appointment;
import hmsystem.models.Availability;
import hmsystem.models.enums.TimeSlot;

public interface AvailabilityManager {

    // Patient Methods

    /**
     * Patients can view available appointment slots with doctors.
     * 
     * @param doctorID the ID of the doctor
     * @param date     the date for which to check availability
     * @return a list of available TimeSlots (enum)
     */
    List<TimeSlot> viewAvailableSlots(String doctorID, LocalDate date);

    // Doctor Methods

    /**
     * Doctors can view their personal schedule.
     * 
     * @param doctorID the ID of the doctor
     * @return a list of TimeSlots and show which are (FREE / NOT_FREE /
     *         APPOINTMENT)
     */
    List<Appointment> viewPersonalSchedule(String doctorID);

    /**
     * Doctors can set their availability for appointments.
     * 
     * @param doctorID     the ID of the doctor
     * @param availability the Availability object containing date and available slots
     */
    void setAvailability(String doctorID, Availability availability);
}
