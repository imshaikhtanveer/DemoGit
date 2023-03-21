package com.quiz.mainpage;



import com.quiz.commonconnectionpage.*;
import com.quiz.examination.*;
import com.quiz.loginpage.*;
import com.quiz.registrationpage.*;

import java.util.Scanner;


public class MainMethod {
	
	
	
	public static void main(String args[]) {
		
		//Student registration
		


StudentRegistration sr= new StudentRegistration(); 
Scanner sc=new Scanner(System.in);
		
		System.out.println("<<Student Registration Page>>");
		
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
	
		
		
		sr.insertDetails(fName, lName,  userName, password,  city, 
				mailId,  mobileNo);
		
		
		System.out.println("\n \n <<<Login Page>>>");
		
		
		//login page
		
		
		
			
			
		LoginPage fr1= new LoginPage(); 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username ");
		String userName1 = scanner.nextLine();
		
		System.out.println("Enter  password");
		String password1 = scanner.nextLine();
		
		 fr1.fetchRecord(userName1,password1);
		 
		
		
		
		 //Question and answer
		 
		 Quiz_Questions qs=new Quiz_Questions();
			qs.method_1();
		
		
		
		
	}

}
