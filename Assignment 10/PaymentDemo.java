abstract class Payment {

    // Abstract method
    abstract void makePayment(double amount);
}

// Credit Card Payment
class CreditCardPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: " + amount);
        System.out.println("Credit Card payment successful.");
    }
}

// UPI Payment
class UPIPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: " + amount);
        System.out.println("UPI payment successful.");
    }
}

// Main class
public class PaymentDemo {

    public static void main(String[] args) {

        // Credit Card payment
        Payment creditCard = new CreditCardPayment();
        creditCard.makePayment(2500);

        System.out.println();

        // UPI payment
        Payment upi = new UPIPayment();
        upi.makePayment(1500);
    }
}