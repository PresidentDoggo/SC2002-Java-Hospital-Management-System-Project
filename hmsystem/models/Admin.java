package hmsystem.models;

class Admin extends Staff {
    
    public Admin(String userID, String name, int age, String gender, String email, int contactNumber, String userRole) {
        super(userID, name, age, gender, email, contactNumber, userRole);
    }
}
