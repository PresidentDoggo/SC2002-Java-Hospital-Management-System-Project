public class User
{
    private int userID; //Unique integer identifier for each user, a.k.a UserName

    private String firstName; //First name
    private String lastName; //Last name

    private String defaultPW; //Default password for all users which they can then change to their liking
    private String role; //Patient, Doctor, Pharmacist, Admin as part of the project



    
    User(int userID, String firstName, String lastName, String role)
    {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.defaultPW = "I_l0ve_working_4_3ver";

    }

    public void setuserID(int userID)
    {
        this.userID = userID;
    }
    public int getUserID()
    {
        return userID;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

}
