package Database;

import java.sql.*;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "";
		String uname = "root";
		String pass = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
	}


}
