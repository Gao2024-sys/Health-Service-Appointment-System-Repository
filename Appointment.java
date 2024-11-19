public class Appointment {

    private final String patientName;

    String patientMobile;

    private final String preferredTimeSlot;

    private final HealthProfessional doctor;



    // Default constructor


    // Constructor with parameters

    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {

        this.patientName = patientName;

        this.patientMobile = patientMobile;

        this.preferredTimeSlot = preferredTimeSlot;

        this.doctor = doctor;

    }



    // Method to print details

    public void printDetails() {

        System.out.println("Patient Name: " + patientName);

        System.out.println("Patient Mobile: " + patientMobile);

        System.out.println("Preferred Time Slot: " + preferredTimeSlot);

        System.out.println("Doctor Details:");

        doctor.printDetails();

    }

}