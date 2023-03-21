package com.quiz.examination;
import com.quiz.commonconnectionpage.*;
import java.util.HashMap;
import com.quiz.*;
import java.util.Map;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Quiz_Questions {
	int correctAnsCount=0;
	int wrongAnsCount=0;
Scanner sc= new Scanner(System.in);
public void method_1() {
	Questions questions_1=new Questions("QUE-1> Array in java are ?","A. Object reference", "B. Objects", "C. Primitive data type", "D. None");
	Questions questions_2=new Questions("QUE-2> Which component is used to compile, debug and execute the java programs ?","A. JRE", "B. JIT", "C. JDK", "D. JVM");
	Questions questions_3=new Questions("QUE-3> What is the return type of the hashCode() method in the Object class ?","A. Object", "B. int", "C. long", "D. void");
	Questions questions_4=new Questions("QUE-4> Which keyword is used for accessing the features of a package ?","A. package", "B. import", "C. extends", "D. export");
	Questions questions_5=new Questions("QUE-5> In java, jar stands for_?","A. Java Archive Runner", "B. Java Application Resource", "C. Java Application Runner", "D. None of the above");
	Questions questions_6=new Questions("QUE-6> Which of the following for loop declaration is not valid ?","A. for ( int i = 99; i >= 0; i / 9 )", "B. for ( int i = 7; i <= 77; ++i )", "C. for ( int i = 20; i >= 2; - -i )", "for ( int i = 2; i <= 20; i = i++ )");
	Questions questions_7=new Questions("QUE-7> An interface with no fields or methods is known as a ______.","A. Runnable Interface", "B. Marker Interface", "C. Abstract Interface", "D. CharSequence Interface");
	Questions questions_8=new Questions("QUE-8> Which option is false about the final keyword ?","A. A final method cannot be overridden in its subclasses", "B. A final class cannot extend other classes", "C. A final method can be inherited", "D. None");
	Questions questions_9=new Questions("QUE-9> Which of these classes are the direct subclasses of the Throwable class ?","A. RuntimeException and Error class", "B. Exception and VirtualMachineError class", "C. Error and Exception class", "D. IOException and VirtualMachineError class");
	Questions questions_10=new Questions("QUE-10> In which memory a String is stored, when we create a string using new operator ?","A. Stack", "B. String memory", "C. Heap memory", "D. Random storage space");

	
	Map<Questions,Character> obj=new HashMap<>();
	obj.put(questions_1, 'B');
	obj.put(questions_2, 'C');
	obj.put(questions_3, 'B');
	obj.put(questions_4, 'B');
	obj.put(questions_5, 'D');
	obj.put(questions_6, 'A');
	obj.put(questions_7, 'B');
	obj.put(questions_8, 'B');
	obj.put(questions_9, 'C');
	obj.put(questions_10, 'C');
	
    for(Map.Entry<Questions,Character> map:obj.entrySet()){
        System.out.println(map.getKey().getQuestations());
        System.out.println(map.getKey().getOpt_1());
        System.out.println(map.getKey().getOpt_2());
        System.out.println(map.getKey().getOpt_3());
        System.out.println(map.getKey().getOpt_4());
        
        System.out.println("Enter Your Answer: ");
        Character ans=sc.next().charAt(0);

        int cans=Character.compare(ans,map.getValue());
        if(cans==0){
            System.out.println("Correct Answer");
            correctAnsCount++;
        }
        else{
            System.out.println("Wrong Answer");
            wrongAnsCount++;
        }

    }

    System.out.println();
    System.out.println("----------------------------Result----------------------------");
    System.out.println("Your Score is >> "+correctAnsCount+"/10");
  int percentage=(100*correctAnsCount)/obj.size();
    System.out.println("Your Percentage is >> " +percentage);
    
    if(percentage>75){
        System.out.println("Congratulations you have pass first class with distinction...!");
    }
    else if(percentage<75 && percentage > 35){
        System.out.println("Congratulations you have pass with secound class...!");
    }
    else if(percentage<35) {
        System.out.println("You have fail...!");
        System.out.println("Better luck next time");
        this.insertRecords(0); }
    } public void insertRecords(int marks) {
		try {
			//Step-3 get connection
	 Connection connection=CommonConnection1.getConnection();
	   // step-4 prepared statement
	 PreparedStatement preparedStatement = connection.prepareStatement
			 ("insert into student(marks) values(?)");
	 preparedStatement.setInt(1, correctAnsCount);
	 System.out.println("Insertion successfull....!");
		
	 
	 
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
}
}
