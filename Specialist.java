public class Specialist extends HealthProfessional {

    private final String areaOfExpertise;



    // Default constructor


     // Overridden method to print details of the general practitioner

    public Specialist(int id, String name, String areaOfExpertise) {

        super(id, name, "Specialist");

        this.areaOfExpertise = areaOfExpertise;

    }



    // Method to print details
     // Overridden method to print details of the specialis
    @Override

    public void printDetails() {

        super.printDetails();// Call the parent class's printDetails method

        System.out.println("Area of Expertise: " + areaOfExpertise);

    }

}
