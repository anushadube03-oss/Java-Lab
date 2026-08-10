final class College {
    final int COLLEGE_ID = 101;

    final void display() {
        System.out.println("College ID: " + COLLEGE_ID);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        College c = new College();

        c.display();

    }
}