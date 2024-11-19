import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Bruce", true);

        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Gracia", false);

        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Vincent", true);

        Specialist specialist1 = new Specialist(4, "Dr. Kari", "Cardiology");

        Specialist specialist2 = new Specialist(5, "Dr. Scott", "Neurology");

        gp1.printDetails();

        gp2.printDetails();

        gp3.printDetails();

        specialist1.printDetails();

        specialist2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments

        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("Wendy", "1649265834", "08:00", gp1));

        appointments.add(new Appointment("Paz", "6798233478", "10:00", gp2));

        appointments.add(new Appointment("Peggy", "1945384638", "14:30", specialist1));

        appointments.add(new Appointment("Tomas", "5286423126", "09:00", specialist2));

        printExistingAppointments(appointments);

        cancelBooking(appointments, "1649265834");

        printExistingAppointments(appointments);

    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {

        if (appointments.isEmpty()) {

            System.out.println("No existing appointments.");

        } else {

            for (Appointment app : appointments) {

                app.printDetails();

                System.out.println("------------------------------");

            }

        }

    }


    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {

        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {

            if (appointments.get(i).patientMobile.equals(patientMobile)) {

                appointments.remove(i);

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("No appointment found for mobile number: " + patientMobile);

        }

    }

}