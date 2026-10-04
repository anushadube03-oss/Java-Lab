import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Assignment24 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Book Issue Tracking System");

        JLabel l1 = new JLabel("Book ID:");
        JLabel l2 = new JLabel("Student Name:");
        JLabel l3 = new JLabel("Issue Date:");
        JLabel l4 = new JLabel("Return Date:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        JButton add = new JButton("Add");
        JButton view = new JButton("View");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        frame.add(add);
        frame.add(view);

        add.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO book_issue VALUES (?, ?, ?, ?)");

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setString(4, t4.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(frame, "Record added successfully.");

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        view.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");

                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM book_issue");

                String data = "";

                while (rs.next()) {
                    data += "Book ID: " + rs.getInt("bookid") +
                            "\nStudent: " + rs.getString("studentname") +
                            "\nIssue Date: " + rs.getString("issuedate") +
                            "\nReturn Date: " + rs.getString("returndate") +
                            "\n\n";
                }

                JOptionPane.showMessageDialog(frame, data);

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}