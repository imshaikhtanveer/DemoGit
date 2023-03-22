package com.quiz.loginpage;

import com.quiz.commonconnectionpage.*;

import com.quiz.mainpage.*;
import com.quiz.registrationpage.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.util.Scanner;


public class LoginPage{

	public static void checkLogin(String userName1, String password1) {
		
		try {
			Connection connection=CommonConnection1.getConnection();
			
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from details where username=? AND password=? ");
			
			
			 for(int i=1;i<=10;i++)
			 {
			preparedStatement.setString(1, userName1);
			preparedStatement.setString(2, password1);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			
			
			
			   boolean checkuser = false;
			     if (resultSet.next())
			     {
			    	 checkuser= true;
			       	 System.out.println("<<<Login Succesfully>>>");
			         System.out.println(" ");
			         break;
			     }
			
			else {
				
				
				System.out.println("\n You have entered wrong user name password ");
				}
				
				
				} 
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username ");
		String userName = scanner.nextLine();
		
		System.out.println("Enter  password");
		String password = scanner.nextLine();
		
	//	checkLogin(userName,password);
	}

}
