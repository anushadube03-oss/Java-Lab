abstract class FoodOrder {

    protected double foodPrice;

    // Constructor
    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    // Abstract method
    abstract void calculateBill();
}

// Dine-In Order
class DineInOrder extends FoodOrder {

    DineInOrder(double foodPrice) {
        super(foodPrice);
    }

    @Override
    void calculateBill() {
        double serviceCharge = foodPrice * 0.10;
        double totalBill = foodPrice + serviceCharge;

        System.out.println("Order Type: Dine-In");
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Total Bill: " + totalBill);
    }
}

// Take-Away Order
class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double foodPrice) {
        super(foodPrice);
    }

    @Override
    void calculateBill() {
        double packingCharge = 50;
        double totalBill = foodPrice + packingCharge;

        System.out.println("Order Type: Take-Away");
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Total Bill: " + totalBill);
    }
}

// Main class
public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(1000);
        dineIn.calculateBill();

        System.out.println();

        FoodOrder takeAway = new TakeAwayOrder(1000);
        takeAway.calculateBill();
    }
}
