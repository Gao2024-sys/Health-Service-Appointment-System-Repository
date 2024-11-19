public class HealthProfessional {

    protected int id;

    protected String name;

    protected String specialization;



    // Default constructor


    // Constructor with parameters

    public HealthProfessional(int id, String name, String specialization) {

        this.id = id;

        this.name = name;

        this.specialization = specialization;

    }



    // Method to print details

    public void printDetails() {

        System.out.println("Health Professional ID: " + id);

        System.out.println("Name: " + name);

        System.out.println("Specialization: " + specialization);

    }

}
