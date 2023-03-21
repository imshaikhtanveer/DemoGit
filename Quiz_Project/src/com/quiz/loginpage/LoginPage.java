package com.quiz.loginpage;

import com.quiz.commonconnectionpage.*;
import com.quiz.registrationpage.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginPage{

	public static void fetchRecord(String userName1, String password1) {
		
		try {
			Connection connection=CommonConnection1.getConnection();
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from details where username=? AND password=? ");
			
			preparedStatement.setString(1, userName1);
			preparedStatement.setString(2, password1);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			
			
			
			if(resultSet.next()) {
				
				//System.out.println("username>>" +resultSet.getString(1));
				//System.out.println("password>>" +resultSet.getString(2));
				
				System.out.println("\n You have succesfully login ");
				
			}
			
			else {
				
				
				System.out.println("\n You have entered wrong user name password ");
				}
				
				
				
				
				
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username ");
		String userName = scanner.nextLine();
		
		System.out.println("Enter  password");
		String password = scanner.nextLine();
		
		 fetchRecord(userName,password);*/
	}

}
