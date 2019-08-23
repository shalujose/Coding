package com.revature.Banking;
import java.sql.SQLException;

import jdbc.StudentDAO;
public class TestDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int id=107;
		StudentDAO.delete(id);
	}

}
