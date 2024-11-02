public abstract class Profile 
{

    public abstract void displayProfile(); //Various Profiles will implement their own version of this method, therefore I have set it as Abstract


    private String emailAddress;
    private String userPassword;
    private String userRole;

    public Profile(String emailAddress, String userPassword, String userRole) 
    {
        this.emailAddress = emailAddress;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
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
