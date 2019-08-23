
 package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/training_db";
		String username="root";
		String password="root";
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println(con);
		
		
		// insert to db
		
		//String sql="insert into Student_Record(id,name,gender,department) values(?,?,?,?)";
		//PreparedStatement pst=con.prepareStatement(sql);
		//pst.setInt(1,101);
		//pst.setString(2,"Abhilash");
		//pst.setString(3,"M");
		//pst.setString(4,"MCA");
		//int rows=pst.executeUpdate();
		//System.out.println("No of rows inserted:"+rows);
		
		//String sql1="insert into Student_Record(id,name,gender,department) values(102,'Basith','M','MBA')";
		//PreparedStatement pst1=con.prepareStatement(sql1);
		//int rows1=pst1.executeUpdate();
		//System.out.println("No of rows inserted:"+rows1);
		
		String sql1="insert into Student_Record(id,name,gender,department) values(103,'Amal','M','MTech')";
		PreparedStatement pst1=con.prepareStatement(sql1);
		/*int rows1=pst1.executeUpdate();
		System.out.println("No of rows inserted:"+rows1);*/
		
		//update to db
		
		String sqlu="update Student_Record set name=? where id=?";
		PreparedStatement pstu=con.prepareStatement(sqlu);
		pstu.setString(1,"Abhilash");
		pstu.setInt(2,101);
		
		/*int row2=pstu.executeUpdate();
		System.out.println("No of rows updated"+row2);*/
		
		
		//delete records
		
		String sqld="delete from Student_Record where id=?";
		PreparedStatement pstd=con.prepareStatement(sqld);
		//pstd.setString(1,"Abhilash");
		pstd.setInt(1,101);
		
		int row3=pstd.executeUpdate();
		System.out.println("No of rows updated"+row3);
		
		//Select data
		
		String sqls="select id,name from Student_Record";
		PreparedStatement psts=con.prepareStatement(sqls);
		ResultSet rs=psts.executeQuery();
		while(rs.next())
		{
			Integer id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+"-"+name);
		}
		

		
	}
	public static Connection connectonCheck() throws ClassNotFoundException, SQLException {
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/training_db";
		String username="root";
		String password="root";
	
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println(con);
		return con;
		
		
	}

}
