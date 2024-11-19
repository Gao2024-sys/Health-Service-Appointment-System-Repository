public class GeneralPractitioner extends HealthProfessional {

    private final boolean acceptsMedicare;



    // Default constructor


    // Constructor with parameters

    public GeneralPractitioner(int id, String name, boolean acceptsMedicare) {

        super(id, name, "General Practitioner");

        this.acceptsMedicare = acceptsMedicare;

    }



    // Method to print details

    @Override

    public void printDetails() {

        super.printDetails();

        System.out.println("Accepts Medicare: " + acceptsMedicare);

    }

}