//Singleton
public class LoginController {

    private  static final LoginController loginController = new LoginController();

    protected LoginController() {

    }

    public static LoginController getInstance() {
            return loginController;
        
    }

}
