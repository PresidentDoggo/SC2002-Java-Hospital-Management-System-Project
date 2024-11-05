import java.util.List;

public class AppointmentManager
        implements AppointmentManagerDoctor, AppointmentManagerPatient, AppointmentManagerAdmin {

    private AppointmentList appointmentList;

    public AppointmentManager() {
        this.appointmentList = new AppointmentList();
    }

    // Patient Methods
    @Override
    // Patients view available appointment slots with doctors.
    public List<Appointment> viewAvailableSlots(String doctorID) {
        return appointmentList.getAppointmentsForDoctor(doctorID);
    }

    @Override
    // Patients schedule appointments
    public void scheduleAppointment(String patientID, String doctorID, Appointment appointment) {
        appointmentList.addAppointment(appointment);
    }

    @Override
    // Patients reschedule appointments
    public void rescheduleAppointment(String patientID, String appointmentID, Appointment newAppointment) {
        Appointment appointment = appointmentList.findAppointmentByID(appointmentID);
        if (appointment != null && appointment.getPatientID().equals(patientID)) {
            appointmentList.removeAppointment(appointmentID);
            appointmentList.addAppointment(newAppointment);
        }
    }

    @Override
    // Patients cancel appointments
    public void cancelAppointment(String patientID, String appointmentID) {
        Appointment appointment = appointmentList.findAppointmentByID(appointmentID);
        if (appointment != null && appointment.getPatientID().equals(patientID)) {
            appointmentList.removeAppointment(appointmentID);
        }
    }

    @Override
    // Patients view the status of their schedules appointments
    public List<Appointment> getPatientAppointments(String patientID) {
        return appointmentList.getAppointmentsForPatient(patientID);
    }

    // Doctor Methods
    @Override
    // Doctors view their personal schedule
    public List<Appointment> getDoctorSchedule(String doctorID) {
        return appointmentList.getAppointmentsForDoctor(doctorID);
    }

    @Override
    // Doctors set their availability for appointments
    public void setDoctorAvailability(String doctorID, Appointment appointment) {
        appointmentList.addAppointment(appointment);
    }

    @Override
    // Doctors accept appointment requests
    public void acceptAppointmentRequest(String doctorID, String appointmentID) {
        Appointment appointment = appointmentList.findAppointmentByID(appointmentID);
        if (appointment != null && appointment.getDoctorID().equals(doctorID)) {
            appointment.setStatus(Appointment.AppointmentStatus.CONFIRMED);
        }
    }

    @Override
    // Doctors decline appointment requests
    public void declineAppointmentRequest(String doctorID, String appointmentID) {
        Appointment appointment = appointmentList.findAppointmentByID(appointmentID);
        if (appointment != null && appointment.getDoctorID().equals(doctorID)) {
            appointment.setStatus(Appointment.AppointmentStatus.CANCELED);
        }
    }

    @Override
    // Doctors 
    public List<Appointment> getDoctorAppointments(String doctorID) {
        return appointmentList.getAppointmentsForDoctor(doctorID);
    }

    // Administrator Methods
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentList.getAllAppointments();
    }
}
