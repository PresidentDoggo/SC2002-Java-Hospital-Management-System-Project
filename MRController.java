//Singleton
public class MRController {

    private  static final MRController MRController = new MRController();

    protected MRController() {

    }

    public static MRController getInstance() {
            return MRController;
        
    }

}
