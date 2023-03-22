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


System.out.println("Welcome to Quiz based application");

System.out.println("Enter your choice>>");
System.out.println("1. Registration");
System.out.println("2. Login");

int no=sc.nextInt();

if (no==1)
{
		
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
	
		
		
		insertDetails(fName, lName,  userName, password,  city, 
				mailId,  mobileNo);
		
}
else if(no==2) {
		System.out.println("\n \n <<<Login Page>>>");
		
		
		//login page
		
		
		
			
			
		LoginPage lp= new LoginPage(); 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username ");
		String userName1 = scanner.nextLine();
		
		System.out.println("Enter  password");
		String password1 = scanner.nextLine();
		
		 checkLogin(userName1,password1);
		 
		
		
		
		 //Question and answer
		 
		 Quiz_Questions qs=new Quiz_Questions();
			qs.method_1();
		
}else {
        System.out.println("Invalid choice");
}
      }
		
	

	private static void checkLogin(String userName1, String password1) {
		// TODO Auto-generated method stub
		
	}

	private static void insertDetails(String fName, String lName, String userName, String password, String city,
			String mailId, String mobileNo) {
		// TODO Auto-generated method stub
		
	}

}
