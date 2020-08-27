package mypackage.Aug21.Task2;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbConntProduct {
	public static Connection getConnect(){
	try{
	Class.forName("oracle.jdbc.OracleDriver"); 
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
	return con;
	}
	catch (Exception e) {
	e.printStackTrace();
	return null;
	}
	}
}