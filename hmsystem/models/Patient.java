package hmsystem.models;
public class Patient extends User {

    private String dateOfBirth;
    private String bloodType;

    public Patient(String userID, String name, int age, String gender, String email, int contactNumber, String userRole,
            String dateOfBirth, String bloodType) {
        super(userID, name, age, gender, email, contactNumber, userRole);
        this.dateOfBirth = dateOfBirth;
        this.bloodType = bloodType;
    }

    // Getters
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodType() {
        return bloodType;
    }
}