class Pharmacist extends Staff {

    public Pharmacist(String userID, String name, int age, String gender, String email, int contactNumber,
            String userRole) {
        super(userID, name, age, gender, email, contactNumber, userRole);
    }
    
    public void displayMenu(){
        System.out.println("[-------------------------------------------]");
        System.out.println("| 1. View Appointment Outcome Record        |");
        System.out.println("| 2. Update Prescription Status             |");
        System.out.println("| 3. View Medication Inventory              |");
        System.out.println("| 4. Submit Replenishment Request           |");
        System.out.println("| 5. Logout                                 |");
        System.out.println("[-------------------------------------------]");
    }
}
