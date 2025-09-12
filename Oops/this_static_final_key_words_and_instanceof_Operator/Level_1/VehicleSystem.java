class Vehicle {

    static double registrationFee = 5000.0;

    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;  // 'this' resolves ambiguity
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {   // instanceof check
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("----------------------------");
        } else {
            System.out.println("Not a valid Vehicle object!");
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("UP32AB1234", "Sachin Saini", "Car");
        Vehicle v2 = new Vehicle("DL05XY5678", "Rahul Verma", "Bike");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000.0);

        v1.displayDetails();
        v2.displayDetails();
    }
}
