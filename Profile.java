import java.util.Scanner;

public abstract class Profile 
{

    public abstract void displayProfile(); //Various Profiles will implement their own version of this method, therefore I have set it as Abstract

    private String hospitalID;
    private String emailAddress;
    private String userPassword;
    private String userRole;

    private static final String DEFAULT_PASSWORD = "I_l0ve_working_4_3ver";

    public Profile(String hospitalID, String userPassword, String emailAddress, String userRole) 
    {
        this.hospitalID = hospitalID;
        this.userPassword = userPassword;
        this.emailAddress = emailAddress;
        this.userRole = userRole;
    }

    public String getHospitalID() 
    {
        return hospitalID;
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
