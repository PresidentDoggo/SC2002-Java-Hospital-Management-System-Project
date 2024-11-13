//Singleton
public class AppointmentController {

    private  static final AppointmentController appointmentController = new AppointmentController();

    protected AppointmentController() {

    }

    public static AppointmentController getInstance() {
            return appointmentController;
        
    }

}
