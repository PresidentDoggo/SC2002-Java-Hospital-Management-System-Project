class Administrator extends Staff {
    
    public Administrator(String userID, String name, int age, String gender, String email, int contactNumber, String userRole) {
        super(userID, name, age, gender, email, contactNumber, userRole);
    }
    public void displayMenu(){
        System.out.println("[-------------------------------------------]");
        System.out.println("| 1. View and Manage Hospital Staff         |");
        System.out.println("| 2. View Appointments details              |");
        System.out.println("| 3. View and Manage Medication Inventory   |");
        System.out.println("| 4. Approve Replenishment Requests         |");
        System.out.println("| 5. Logout                                 |");
        System.out.println("[-------------------------------------------]");
    }
}
