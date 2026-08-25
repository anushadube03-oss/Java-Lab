import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18)
                throw new AgeException("You are not eligible to vote");

            System.out.println("You are eligible to vote");

        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
