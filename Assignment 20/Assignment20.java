import java.sql.*;

public class Assignment20 {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");

        Statement stmt = con.createStatement();

        stmt.executeUpdate(
            "INSERT INTO student2 VALUES (5, 'Aman', 88)");

        stmt.executeUpdate(
            "UPDATE student2 SET marks = 92 WHERE rollno = 5");

        stmt.executeUpdate(
            "DELETE FROM student2 WHERE rollno = 5");

        System.out.println("Insert, Update and Delete operations completed.");

        con.close();
    }
}