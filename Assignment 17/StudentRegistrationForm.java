

import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"B.Tech", "BCA", "B.Sc", "MCA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JButton registerButton = new JButton("Register");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(courseLabel);
        frame.add(courseBox);

        frame.add(new JLabel(""));
        frame.add(registerButton);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String course = (String) courseBox.getSelectedItem();

            JOptionPane.showMessageDialog(frame,
                    "Registration Successful!\n" +
                    "Name: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Course: " + course);
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
