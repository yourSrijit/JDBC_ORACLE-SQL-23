package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class dbconnection {
	private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	/* for mysql 
	 * DRIVERNAME="com.mysql.jdbc.Driver";
	 * URL = "jdbc:mysql://localhost:3306/database_name"
	 */
	private static final String PASSWORD ="system";
	private static final String USERNAME ="system";
	public static Connection getConnection() {
		Connection con = null;
		try {
			//Registering Driver
			Class.forName(DRIVERNAME);  //throws ClassNotFoundException (Checked Exception)
			//Class.forName(className)
			//Creating Connection
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD); //throws SQLException (Checked Exception)
			//DriverManager.getConnection(url, user, password)
		} catch (ClassNotFoundException ex) {

			System.out.println("connection not establisted" );
			ex.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return con;
	}

}