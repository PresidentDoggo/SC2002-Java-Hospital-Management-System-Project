import java.util.List;

public interface AppointmentManagerPatient {

    List<Appointment> viewAvailableSlots(String doctorID);

    void scheduleAppointment(String patientID, String doctorID, Appointment appointment);

    void rescheduleAppointment(String patientID, String appointmentID, Appointment newAppointment);

    void cancelAppointment(String patientID, String appointmentID);

    List<Appointment> getPatientAppointments(String patientID);
}
