// Product Interface
interface Product {
    void displayProduct();
}

// Parent class
class ProductDetails {
    String name;
    double price;

    ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Electronic Product
class Electronic extends ProductDetails implements Product {

    Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Product Type: Electronic");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

// Clothing Product
class Clothing extends ProductDetails implements Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Product Type: Clothing");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

// Grocery Product
class Grocery extends ProductDetails implements Product {

    Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Product Type: Grocery");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

// Main class
public class ECommerceDemo {

    public static void main(String[] args) {

        Electronic electronic =
                new Electronic("Laptop", 55000);

        Clothing clothing =
                new Clothing("T-Shirt", 800);

        Grocery grocery =
                new Grocery("Rice", 1200);

        electronic.displayProduct();

        System.out.println();

        clothing.displayProduct();

        System.out.println();

        grocery.displayProduct();
    }
}