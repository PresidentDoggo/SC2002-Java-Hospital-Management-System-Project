package hmsystem.models;
import java.util.Scanner;

public abstract class Profile 
{

    private String hospitalID;
    private String name;
    private String emailAddress;
    private String userPassword;
    private String userRole;

    protected static final String DEFAULT_PASSWORD = "I_l0ve_working_4_3ver";

    public Profile(String hospitalID, String name, String emailAddress, String userPassword, String userRole) 
    {
        this.hospitalID = hospitalID;
        this.name = name;
        this.emailAddress = emailAddress;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public String getHospitalID() 
    {
        return hospitalID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String newPassword) {
        this.userPassword = newPassword;
    }


    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword() 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------Password Manager-----------");

        System.out.println("Enter your old password: ");
        String oldPassword = input.nextLine();

        if(this.userPassword.equals(oldPassword)) //Added a security check where User has to enter old Password first before changing
        {
            System.out.println("Enter your new password: ");
            String newPassword = input.nextLine();

            this.userPassword = newPassword;

            System.out.println("Password changed successfully.");
        } 
        else
        {
            System.out.println("Old password is incorrect. Password change failed. Try again.");
            setUserPassword();
        }
    }


    public String getUserRole()
    {
        return userRole;
    }

    public void setUserRole(String userRole)
    {
        this.userRole = userRole;
    }

    

}
