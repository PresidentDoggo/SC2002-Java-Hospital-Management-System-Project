public class Administrator extends Profile
{
    public Administrator(String hospitalID, String name, String emailAddress) 
    {
        super(hospitalID, name, emailAddress, DEFAULT_PASSWORD , "Administrator");
    }

    
    public void displayProfile() 
    {
        System.out.println("Welcome to the BrainRot Hospital!");
        System.out.println("Glad to See You Mr/Ms " + getName()  + "!");
        
        System.out.println("1. View and Manage Hospital Staff");
        System.out.println("2. View Appointment Details");
        System.out.println("3. View and Manage Medication Inventory");
        System.out.println("4. Approve Replenishment Requests");
        System.out.println("5. Change Password");
        System.out.println("6. Logout");

    }
    
}
