import java.util.List;

public interface AppointmentManagerDoctor {

    List<Appointment> getDoctorSchedule(String doctorID);

    void setDoctorAvailability(String doctorID, Appointment appointment);

    void acceptAppointmentRequest(String doctorID, String appointmentID);

    void declineAppointmentRequest(String doctorID, String appointmentID);

    List<Appointment> getDoctorAppointments(String doctorID);
}
