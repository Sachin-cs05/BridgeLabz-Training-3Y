class Patient {
    
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    private final int patientID;

    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;  
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;  
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients in " + hospitalName + ": " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {   
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Patient object!");
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        
        Patient p1 = new Patient(201, "Sachin Saini", 22, "Fever");
        Patient p2 = new Patient(202, "Rahul Verma", 30, "Fracture");

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
