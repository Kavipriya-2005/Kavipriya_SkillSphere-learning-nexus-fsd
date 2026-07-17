import java.sql.*;

public class JdbcInsert {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "862005k*77P");

            System.out.println("Connected Successfully");

            String sql = "INSERT INTO student(name, age) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Kavi");
            ps.setInt(2, 20);

            int rows = ps.executeUpdate();

            System.out.println(rows + " Record Inserted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}