package com.java.module1;
import java.util.*;

public class GradingSystem {
public static void main(String args[]) throws InterruptedException {
	String name,age,phone,school,username,password;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the person");
	name=sc.nextLine();
	System.out.println("enter the age of the person");
	age=sc.nextLine();
	System.out.println("enter the phone number of the person");
	phone=sc.nextLine();
	System.out.println("enter the school name of the person");
	school=sc.nextLine();
	username=school+"ADMIN";
	password=name+age+phone.substring(6);
	System.out.println("the password is"+password);
	
	System.out.println("please enter the username and password to authenicate the user");
	String username1=sc.nextLine();
	System.out.println("enter the password of the student");
	String password1=sc.nextLine();
	
	
	
	if(username.equalsIgnoreCase(username1)&&password.equalsIgnoreCase(password1)) {
		Thread.sleep(1200);
		System.out.println("Authenicated user"+name);
		
		System.out.println("enter the marks of the student");
		
		System.out.println("enter the how many subject the user has");
		int n=Integer.parseInt(sc.nextLine());
		int totalmarks=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the marks for the subject "+i+1+" ");
			int marks=Integer.parseInt(sc.nextLine());
			
			if(marks<0||marks>100) {
				System.out.println("please enter the maks in range from 0-100");
				i--;
				continue;
			}
			totalmarks= totalmarks+marks;
		}
		
		if(totalmarks<200) {
			int practical=70;
		}
	}
}
}
