class FoodOrder {
    int orderId;
    String foodItem;

    FoodOrder(int orderId, String foodItem) {
        this.orderId = orderId;
        this.foodItem = foodItem;
    }

    // Inner Class
    class OrderDetails {
        void display() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Food Item: " + foodItem);
        }
    }
}

interface DeliveryStatus {
    void updateStatus();
}

public class FoodDeliveryApp {
    public static void main(String[] args) {

        FoodOrder order = new FoodOrder(101, "Pizza");

        // Using Inner Class
        FoodOrder.OrderDetails details = order.new OrderDetails();
        details.display();

        // Anonymous Class
        DeliveryStatus status = new DeliveryStatus() {
            @Override
            public void updateStatus() {
                System.out.println("Delivery Status: Order is out for delivery.");
            }
        };

        status.updateStatus();
    }
}