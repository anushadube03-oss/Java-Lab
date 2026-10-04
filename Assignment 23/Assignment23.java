import java.sql.*;

public class Assignment23 {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name") + " " +
                rs.getString("department") + " " +
                rs.getDouble("salary"));
        }

        con.close();
    }
}
