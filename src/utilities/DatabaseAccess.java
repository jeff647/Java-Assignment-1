package utilities;

/****************************************************************************************************
* Description: DatabaseAccess - Example provides access to database
****************************************************************************************************/
import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseAccess {
	//Set username to "admin" after testing
	private static String username = "root";
	private static String password = "admin";
	private static String database = "comp3095";
	
	  private static Connection connect = null;
	  
	  public static Connection connectDataBase() throws Exception {
	    try {
	      // This will load the MySQL driver, each DB has its own driver
	      Class.forName("com.mysql.jdbc.Driver");
	      // Setup the connection with the DB
	      connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/"+database+"?"
		              + "user="+username+"&password="+password);
	      return connect;
	    } catch (Exception e) {
	      throw e;
	    } 
	  }
	  
}