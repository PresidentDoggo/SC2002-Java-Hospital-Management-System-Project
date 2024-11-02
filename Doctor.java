public class Doctor extends Profile
{
    public Doctor(String hospitalID, String name, String emailAddress) 
    {
        super(hospitalID, name, emailAddress, DEFAULT_PASSWORD , "Doctor");
    }

    
    public void displayProfile() 
    {
        System.out.println("Welcome to the BrainRot Hospital!");
        System.out.println("Glad to See You  Mr/Ms " + getName() + "!");

        System.out.println("1. View Patient Medical Records");
        System.out.println("2. Update Patient Medical Records");
        System.out.println("3. View Schedule");
        System.out.println("4. Set Availability");
        System.out.println("5. Change Password");
        System.out.println("6. Logout");

    }
}
