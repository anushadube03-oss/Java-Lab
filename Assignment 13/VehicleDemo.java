class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Inner Class
    class VehicleDetails {
        void display() {
            System.out.println("Vehicle Brand: " + brand);
            System.out.println("Vehicle Model: " + model);
        }
    }
}

interface Action {
    void performAction();
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Corolla");

        // Using Inner Class
        Vehicle.VehicleDetails details = vehicle.new VehicleDetails();
        details.display();

        // Anonymous Class
        Action action = new Action() {
            @Override
            public void performAction() {
                System.out.println("Vehicle is moving.");
            }
        };

        action.performAction();
    }
}