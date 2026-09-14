

import javax.swing.*;
import java.awt.*;

public class BankBalanceCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank Balance Calculator");

        JTextField balanceField = new JTextField();
        JTextField amountField = new JTextField();

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        JLabel result = new JLabel("Updated Balance: ");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(new JLabel("Initial Balance:"));
        frame.add(balanceField);

        frame.add(new JLabel("Transaction Amount:"));
        frame.add(amountField);

        frame.add(depositButton);
        frame.add(withdrawButton);

        frame.add(new JLabel(""));
        frame.add(result);

        depositButton.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            double updatedBalance = balance + amount;

            result.setText("Updated Balance: " + updatedBalance);
        });

        withdrawButton.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            double updatedBalance = balance - amount;

            result.setText("Updated Balance: " + updatedBalance);
        });

        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
