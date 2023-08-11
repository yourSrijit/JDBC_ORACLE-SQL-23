package Student_DB;
import java.sql.*;
public class dbconnection {
    public static final String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
    public static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USER="system";
    public static final String Password="system";
    public static Connection getConnection(){
        Connection con= null;
        try {
            Class.forName(DRIVERNAME); //throw exception class not found
            con=DriverManager.getConnection(URL,USER,Password);  //throws SQLException (Checked Exception)
        }
        catch (ClassNotFoundException e){
            System.out.println("Connection is not established");
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

}
