package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import jdbc.ConnectionUtil;

public class StudentDAO {
	
	public static void insert(int id,String name,String gender,String department)  
	{
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = ConnectionUtil.connectonCheck();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		String sql="insert into Student_Record(id,name,gender,department) values(?,?,?,?)";
				 pst=con.prepareStatement(sql);
				pst.setInt(1,id);
				pst.setString(2,name);
				pst.setString(3,gender);
				pst.setString(4,department);
				int rows=pst.executeUpdate();
				System.out.println("No of rows inserted Successfully : "+rows);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(pst!=null)
			{
				
					pst.close();
			} 
			
			if(con!=null)
			{
				con.close();
			}
			}
			
			catch (SQLException e) {
			
				throw new RuntimeException("Unable to close");
			}
			catch(Exception e){
				throw new RuntimeException("Unable to connect");
			}
		}

	}
	public static void update(int id,String name)  {
		Connection con=null;
		PreparedStatement pstu=null;
		try {
			con = ConnectionUtil.connectonCheck();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String sqlu="update Student_Record set name=? where id=?";
			pstu=con.prepareStatement(sqlu);
			pstu.setString(1,name);
			pstu.setInt(2,id);
			int row2=pstu.executeUpdate();
			System.out.println("No of rows updated Successfully : "+row2 );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pstu!=null)
			{
			try {
				pstu.close();
			} catch (SQLException e) {
				throw new RuntimeException("Unable to close resources");
			}
			}
			if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new RuntimeException("Unable to close the resources");
			}
			}
		}
	}
	
	public static void delete(int id)  {
		
		Connection con=null;
		PreparedStatement pstd=null;
		
		try {
			con = ConnectionUtil.connectonCheck();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		String sqld="delete from Student_Record where id=?";
		 try {
			pstd=con.prepareStatement(sqld);
			pstd.setInt(1,id);
			
			
			int row3=pstd.executeUpdate();
			System.out.println("No of rows deleted Successfully : "+row3);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(pstd!=null) {
					pstd.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch(Exception e) {
				throw new RuntimeException("Unable to close");
			}
		

			
		}
	}
	public static void select() throws SQLException
	{
		Connection con=null;
		PreparedStatement psts=null;
		
		try {
			con = ConnectionUtil.connectonCheck();
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			
			e1.printStackTrace();
		}
	
	String sqls="select id,name from Student_Record";
	 try {
		psts=con.prepareStatement(sqls);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ResultSet rs=null;;
	try {
		rs = psts.executeQuery();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	while(rs.next())
	{
		Integer id=rs.getInt("id");
		String name=rs.getString("name");
		System.out.println(id+"-"+name);
	}
	
	
	}


}
