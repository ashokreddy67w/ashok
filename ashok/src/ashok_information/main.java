package ashok_information;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main{
public static void main(String[] args) {
	try {
		Connection Connection= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement Statement=Connection.createStatement();
		int insertresult=Statement.executeUpdate("update ashok.Ashok_reddy set Ashok_reddy_Address='baguluru' where Ashok_reddy_ID='11' ");
		System.out.println(insertresult);
		
	}
	catch(SQLException e) {
	e.printStackTrace();
	
		
	}
	
}
}