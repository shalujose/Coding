import java.sql.SQLException;

import jdbc.StudentDAO;

public class TestSelect {

	public static void main(String[] args) {
		try {
			StudentDAO.select();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
