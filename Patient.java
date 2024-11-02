public class Patient extends Profile
{
    public Patient(String hospitalID, String name, String emailAddress)
    {
        super(hospitalID, name, emailAddress, DEFAULT_PASSWORD , "Patient");
    }

    public void displayProfile() //Overriding the Abstract Method
    {
        System.out.println("Welcome to the BrainRot Hospital!");
        System.out.println("We are pleased to Serve You! Mr/Ms " + getName() + "!");

        System.out.println("1. View Your Medical Records");
        System.out.println("2. Update Your Personal Information");
        System.out.println("3. View Appointments"); //Brings into Appointments class/menu to schedule/amend/cancel appointment show scheduled appoitments and past appointment outcome records
        System.out.println("4. Change Password");
        System.out.println("5. Logout");
    }
}
