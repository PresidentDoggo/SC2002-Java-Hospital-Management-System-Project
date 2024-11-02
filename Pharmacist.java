public class Pharmacist extends Profile
{
    public Pharmacist(String hospitalID, String name, String emailAddress) 
    {
        super(hospitalID, name, emailAddress, DEFAULT_PASSWORD , "Pharmacist");
    }

    
    public void displayProfile() 
    {
        System.out.println("Welcome to the BrainRot Hospital!");
        System.out.println("Glad to See You  Mr/Ms " + getName()  + "!");
        
        System.out.println("1. View Appointment Outcome Record");
        System.out.println("2. Update Presciption Status");
        System.out.println("3. View Medication Inventory");
        System.out.println("4. Submit Replenisment Request");
        System.out.println("5. Change Password");
        System.out.println("6. Logout");

    }
}
