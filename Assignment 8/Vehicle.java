2.CODE:
class Vehicle {
    String vehicleNumber;
    String vehicleType;

    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class CarInsurance extends Vehicle {
    String insuranceCompany;

    CarInsurance(String vehicleNumber, String vehicleType, String insuranceCompany) {
        super(vehicleNumber, vehicleType); // Calls parent class constructor
        this.insuranceCompany = insuranceCompany;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails(); // Accesses parent class method
        System.out.println("Insurance Company: " + insuranceCompany);
    }
}

class BikeInsurance extends Vehicle {
    String insuranceCompany;

    BikeInsurance(String vehicleNumber, String vehicleType, String insuranceCompany) {
        super(vehicleNumber, vehicleType); // Calls parent class constructor
        this.insuranceCompany = insuranceCompany;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails(); // Accesses parent class method
        System.out.println("Insurance Company: " + insuranceCompany);
    }
}

public class Main {
    public static void main(String[] args) {

        CarInsurance car = new CarInsurance(
            "MH12AB1234", "Car", "ICICI Lombard"
        );

        BikeInsurance bike = new BikeInsurance(
            "MH12XY5678", "Bike", "HDFC ERGO"
        );

        System.out.println("----- Car Insurance -----");
        car.displayInsuranceDetails();

        System.out.println("\n----- Bike Insurance -----");
        bike.displayInsuranceDetails();
    }
}
