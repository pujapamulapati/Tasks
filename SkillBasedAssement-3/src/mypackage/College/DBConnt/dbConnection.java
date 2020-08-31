package mypackage.College.DBConnt;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbConnection {
	public static Connection getConnect(){
	try{
	Class.forName("oracle.jdbc.OracleDriver"); 
	Connection conncetion =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
	return conncetion;
	}
	catch (Exception e) {
	e.printStackTrace();
	return null;
	}
	}
}