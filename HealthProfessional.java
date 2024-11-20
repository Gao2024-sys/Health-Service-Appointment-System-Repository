public class HealthProfessional {

    protected int id;      // ID of the health professional

    protected String name;      // Name of the health professional

    protected String specialization; // Specialization of the health professional

    // Default constructor


      // Constructor to initialize the health professional's information

    public HealthProfessional(int id, String name, String specialization) {

        this.id = id;

        this.name = name;

        this.specialization = specialization;

    }

 // Method to print the health professional's details

    public void printDetails() {

        System.out.println("Health Professional ID: " + id);

        System.out.println("Name: " + name);

        System.out.println("Specialization: " + specialization);

    }

}
