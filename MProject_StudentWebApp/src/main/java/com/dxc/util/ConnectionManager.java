package com.dxc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	protected ConnectionManager() {
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;

		
		String url = "jdbc:mysql://localhost:3306/dxc";
		String un = "root";
		String pw = "root";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, un, pw);
		con.setAutoCommit(false);
		return con;
	}
}
