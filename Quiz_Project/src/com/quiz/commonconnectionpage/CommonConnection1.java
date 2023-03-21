package com.quiz.commonconnectionpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonConnection1 {

	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Root@123");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;
	}

}

