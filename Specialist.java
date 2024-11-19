public class Specialist extends HealthProfessional {

    private final String areaOfExpertise;



    // Default constructor


    // Constructor with parameters

    public Specialist(int id, String name, String areaOfExpertise) {

        super(id, name, "Specialist");

        this.areaOfExpertise = areaOfExpertise;

    }



    // Method to print details

    @Override

    public void printDetails() {

        super.printDetails();

        System.out.println("Area of Expertise: " + areaOfExpertise);

    }

}
