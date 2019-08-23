package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankConnection {

	public static void main(String[] args) {
		
		

		
	}
	public static Connection getConnection() {
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/training_db";
		String username="root";
		String password="root";
		Connection con=null;
	
		try
		{
		Class.forName(driverClassName);
		 try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect DB");
			
		}
		System.out.println(con);
		return con;
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect Driverclass");
		}
		
	}

}
