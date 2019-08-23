

import java.sql.SQLException;

import jdbc.StudentDAO;



public class TestInsertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO.insert(108,"Shaheen","M","CSE");
		StudentDAO.insert(109,"Shanid K P","M","IT");
		StudentDAO.insert(107,"Ann Joe","M","MArch");
		
	}
	
}
