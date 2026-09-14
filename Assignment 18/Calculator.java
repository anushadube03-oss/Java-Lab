

import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");

        JLabel result = new JLabel("Result: ");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(new JLabel("Number 1:"));
        frame.add(num1);

        frame.add(new JLabel("Number 2:"));
        frame.add(num2);

        frame.add(addButton);
        frame.add(subButton);

        frame.add(new JLabel(""));
        frame.add(result);

        addButton.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Result: " + (a + b));
        });

        subButton.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Result: " + (a - b));
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

