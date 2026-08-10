class FoodDelivery
{
    String food = "Pizza";
    int price = 300;

    // Inner class
    class OrderDetails
    {
        void display()
        {
            System.out.println("Food: " + food);
            System.out.println("Price: Rs." + price);
        }
    }

    public static void main(String[] args)
    {
        FoodDelivery order = new FoodDelivery();

        // Inner class object
        FoodDelivery.OrderDetails details = order.new OrderDetails();
        details.display();

        // Anonymous class
        Runnable delivery = new Runnable()
        {
            public void run()
            {
                System.out.println("Delivery Status: Order Delivered");
            }
        };

        delivery.run();
    }
}
