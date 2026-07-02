package ie.pt;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "DB Investigation" );

        String filename = "C:\\work\\training\\java\\users_production.db";

        String connectionString = "jdbc:sqlite:" + filename;
        System.out.println(connectionString);
        try {
            Connection conn = DriverManager.getConnection(connectionString);

            String sql = "SELECT * FROM users";
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                boolean active = rs.getBoolean("active");

                User u = new User(id, name, email, active);
                System.out.println(u);
            }
            // when working with databases it is important to tidy up
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }


    }
}
