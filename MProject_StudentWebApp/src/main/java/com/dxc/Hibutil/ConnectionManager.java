package com.dxc.Hibutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		String dri = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dxc";
		String un = "root";
		String pw = "root";
		
		Class.forName(dri);
		con = DriverManager.getConnection(url, un, pw);
		con.setAutoCommit(false);//?????
		return con;
	}
}
