package View;
public interface generalView{

    // We have a controller for every Object
    // The flow should look somewhat like this

    // Later will implement a login manager for the main application
    // After logging in, we do `while(useViewer());`
    // We call displayMenu() and getOperation() in each useViewer()
    // Call the controller based on what operation we given
    // Return False and go back to the login page if the user logged out

    // private MedicalRecordController MRC = new MedicalRecordController();
    // private AppointmentController AC = new AppointmentController();
    // private AppointmentOutcomeController AOC = new AppointmentOutcomeController();
    // private InventoryController IC = new InventoryController();
    // private ReplenishmentController RC = new ReplenishmentController();
    // private StaffListController SLC = new StaffListController();

    public abstract boolean useViewer();
    public abstract void displayMenu();
    public abstract int getOperation();
}