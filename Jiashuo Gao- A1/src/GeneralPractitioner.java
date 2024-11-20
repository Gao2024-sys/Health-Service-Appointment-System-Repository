public class GeneralPractitioner extends HealthProfessional {

    private final boolean acceptsMedicare;// whether accept medicare



    // Default constructor


    // Constructor with parameters

    public GeneralPractitioner(int id, String name, boolean acceptsMedicare) {

        super(id, name, "General Practitioner");   // Call the parent constructor and set the specialty to "General Practitioner"

        this.acceptsMedicare = acceptsMedicare;

    }



    // Method to print details
     // Overridden method to print details of the general practitioner
    @Override

    public void printDetails() {

        super.printDetails();   // Call the printDetails method of the parent class

        System.out.println("Accepts Medicare: " + acceptsMedicare);

    }

}
