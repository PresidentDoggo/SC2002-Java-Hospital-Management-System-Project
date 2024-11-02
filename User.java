public abstract class User extends Profile
{
    public abstract void displayProfile(); //Various Profiles will implement their own version of this method, therefore I have set it as Abstract

    public User(String hospitalID, String name, String emailAddress, String userRole)
    {
        super(hospitalID, name, emailAddress, DEFAULT_PASSWORD , userRole);
    }

    public void displayMessage()
    {
        System.out.println("Welcome, " + getUserRole() + "!");
    }
}
