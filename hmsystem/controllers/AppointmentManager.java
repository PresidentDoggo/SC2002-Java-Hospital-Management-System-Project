package hmsystem.controllers;
import java.util.List;

import hmsystem.models.Appointment;

public interface AppointmentManager {

    // Patient Methods
    void scheduleAppointment(Appointment appointment);

    void rescheduleAppointment(Appointment appointment);

    void cancelAppointment(String appointmentID);

    List<Appointment> getAppointmentsForPatient(String patientID);

    // Doctor Methods
    void acceptAppointment(Appointment appointment);

    void declineAppointment(Appointment appointment);
    
    List<Appointment> getAppointmentsForDoctor(String doctorID);

    // Admin Methods
    List<Appointment> getAppointmentsForAdmin();
}
