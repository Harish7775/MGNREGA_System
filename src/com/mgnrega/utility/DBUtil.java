package com.mgnrega.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection provideConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/mgnrega";

		try {
			conn = DriverManager.getConnection(url, "root", "7775");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return conn;
	}
}
