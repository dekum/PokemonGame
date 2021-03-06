import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteJDBCDriverConnection {
    /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters

            Class.forName("org.sqlite.JDBC");
             conn= DriverManager.getConnection("jdbc:sqlite:" + System.getProperty("user.dir")
                 + "\\database\\mydatabase.sqlite");

            String url = "jdbc:sqlite:C:\\Users\\ValzoTheOne\\Documents\\mydatabase.sqlite";
            // create a connection to the database
            //conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}