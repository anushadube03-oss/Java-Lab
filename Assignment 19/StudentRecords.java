
import java.sql.*;

public class StudentRecords {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + " " + rs.getString("name"));
        }

        con.close();
    }
}