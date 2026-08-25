import java.util.Scanner;

class ATM_PIN {

    static void checkPIN(int pin) throws Exception {
        if (pin != 1234)
            throw new Exception("Invalid PIN");

        System.out.println("PIN verified successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            checkPIN(pin);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("PIN verification completed");
        }
    }
}
