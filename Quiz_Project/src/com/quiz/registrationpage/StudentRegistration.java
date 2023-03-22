package com.quiz.registrationpage;


import com.quiz.commonconnectionpage.*;
import com.quiz.mainpage.*;
import com.quiz.*;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class StudentRegistration {

	public static void insertDetails(String fName,String lName, 
			String userName, String password, String city, 
			String mailId, String mobileNo) {
		
		
		
		
		
	
	try {
		
		Connection connection = CommonConnection1.getConnection();
		
		PreparedStatement ps=connection.prepareStatement("insert into studentrecords(fname,lname,uname,password,city,email,mobileno)values(?,?,?,?,?,?,?)");
		
				//ps.setInt(1,id);
				ps.setString(1,fName);
				ps.setString(2,lName);
				ps.setString(3,userName);
				ps.setString(4,password);
				ps.setString(5,city);
				ps.setString(6,mailId);
				ps.setString(7,mobileNo);
				
				ps.execute();
				
				
				   
				System.out.println("Regustration succesfully");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("<<Student Registration>>");
		
		System.out.println("Enter Fisrt Name");
		 String fName=sc.nextLine();
		
		 System.out.println("Enter Last Name");
		String lName=sc.nextLine();
		
		System.out.println("Enter UserName Name");
		String  userName=sc.nextLine();
	
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		System.out.println("Enter city>>");
		String city=sc.nextLine();
		
		System.out.println("Enter maild ");
		String mailId=sc.nextLine();
	
		System.out.println("Enter Mobile number");
		String mobileNo=sc.nextLine();
	
		
		
		insertDetails(fName, lName,  userName, password,  city, 
				mailId,  mobileNo);
		

	}
		
		
		
}

