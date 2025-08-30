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
		int practical=0;
		if(totalmarks<200) {
			practical=70;
		}
		else if(totalmarks>=200&&totalmarks<280) {
		 practical=78;
		}
		else if(totalmarks>=280&&totalmarks<340) {
			 practical=85;
		}
		else if(totalmarks>=340&&totalmarks<400) {
			 practical=90;
		}
		else {
			 practical=100;
		}
		int allmarks=totalmarks+practical;
		double average=(allmarks)/n;
		
		System.out.println("the student got the percentage is"+average+"%");
		System.out.println("-------------------------------------------------------------------------");
		String choice = null;
		//grading system of the marks:
		if(average<45) {
			System.out.println("the students is fail");
		}
		else if(average>=45&&average<55) {
			System.out.println("the student is in IMPROVEMENT stage");
			choice="IMPROVEMENT";
		}
		else if(average>=55&&average<65) {
			System.out.println("the student is in GOOD stage");
			choice="GOOD";
		}
		else if(average>=65&&average<75) {
			System.out.println("the student is in AVERAGE stage");
			choice="AVERAGE";
		}
		else if(average>=75&&average<87) {
			System.out.println("the student is in EXCELLENT stage");
			choice="EXCELLENT";
		}
		else {
			System.out.println("the student is in HONOUR");
			choice="HONOUR";
		}
		double prize=0;
		
		switch(choice) {
		
		case "IMPROVEMENT","GOOD":
		{
			System.out.println("No scholarship is found here ");
		}
		break;
		
		case "AVERAGE":
		{
			prize=average*58;
			System.out.println(" scholarship is found here "+prize);
		}
		break;
		case "EXCELLENT":
		{
			prize=average*68;
			System.out.println(" scholarship is found here "+prize);
		}
		break;
		case "HONOUR":
		{
			prize=average*70;
			System.out.println(" scholarship is found here "+prize);
		}
		break;
		
		}
		
			
	}
	else {
		System.out.println("NO match founds");
	}
}
}
