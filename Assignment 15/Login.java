import java.util.Scanner;

class Login {

    static void checkPassword(String password) throws Exception {
        if (!password.equals("1234")) {
            throw new Exception("Invalid password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            checkPassword(password);

            System.out.println("Login successful");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Login process completed");
        }
    }
}

