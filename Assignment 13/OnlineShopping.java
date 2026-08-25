import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException(
                    "Product quantity must be greater than zero."
                );
            }

            System.out.println("Quantity entered: " + quantity);
            System.out.println("Product added to cart successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sc.close();
    }
}

