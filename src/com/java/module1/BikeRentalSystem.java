package com.java.module1;

import java.util.*;

public class BikeRentalSystem {
public static void main(String args[]) throws InterruptedException {
	String name;
	String email,phone,address;
	String age;
	
	Scanner sc=new Scanner(System.in);
	String username="RS Infra",password="RSK@123";
	
	System.out.println("enter the name of the Booking ticket");
	 name=sc.nextLine();
	
	System.out.println("enter the email of the Reservation booking");
	 email=sc.nextLine();
	
	System.out.println("enter the phone of the Booking ticket");
	 phone=sc.nextLine();
	
	System.out.println("enter the address of the Reservation booking");
	 address=sc.nextLine();
	
	System.out.println("enter the username of the Booking ticket");
	String username1=sc.nextLine();
	
	System.out.println("enter the password of the Reservation booking");
	String password1=sc.nextLine();
	
	if(username.equalsIgnoreCase(username1)&&password.equalsIgnoreCase(password1)) {
		System.out.println("the user is authenicated");
		Thread.sleep(1500);
		
		System.out.println("WELCOME TO THE RESERVATION BOOKING TICKET"+username);
		
		String source,destination;
		System.out.println("enter the source of the "+name+" from where to pick up");
		source=sc.nextLine();
		
		System.out.println("enter the source of the "+name+" from where to pick up");
		destination=sc.nextLine();
		
		System.out.println("enter the age of the person"+name);
		age=sc.nextLine();
		
		String choice;
		int hours;
		String time;
		double fare=0;
		
		System.out.println("enter the roadways you want to travel EX:bike,train,bus,air");
		choice=sc.nextLine();
		
		System.out.println("enter the kilometer you have travelled");
		hours=Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case "bike":{
			System.out.println("you have book the "+choice);
			fare=5*hours;
			System.out.println("enter the time of booking in morning,afternoon,evening night ");
			time=sc.nextLine();
		
			switch(time) {
			case "morning","night":{
				fare=fare+(fare*0.10);
			}
			break;
			case "afternoon","evening":{
				System.out.println("no Pick hour time is scheduled here");
			}
			break;	
		}	
			if(hours>=10) {
				System.out.println("discount is added");
				fare=fare-(fare*0.20);
			}
			else {
				System.out.println("no discount is added here ");
			}
			
		}
		break;
		
		case "car":{
			System.out.println("you have book the "+choice);
			fare=8*hours;
			System.out.println("enter the time of booking in morning,afternoon,evening night ");
			time=sc.nextLine();
		
			switch(time) {
			case "morning","night":{
				fare=fare+(fare*0.12);
			}
			break;
			case "afternoon","evening":{
				System.out.println("no Pick hour time is scheduled here");
			}
			break;	
		}	
			if(hours>=10) {
				System.out.println("discount is added");
				fare=fare-(fare*0.20);
			}
			else {
				System.out.println("no discount is added here ");
			}
			
		}
		break;
		
		case "train":{
			System.out.println("you have book the "+choice);
			fare=7*hours;
			System.out.println("enter the time of booking in morning,afternoon,evening night ");
			time=sc.nextLine();
		
			switch(time) {
			case "morning","night":{
				fare=fare+(fare*0.10);
			}
			break;
			case "afternoon","evening":{
				System.out.println("no Pick hour time is scheduled here");
			}
			break;	
		}	
			if(hours>=10) {
				System.out.println("discount is added");
				fare=fare-(fare*0.09);
			}
			else {
				System.out.println("no discount is added here ");
			}
			
		}
		break;
		
		case "air":{
			System.out.println("you have book the "+choice);
			fare=15*hours;
			System.out.println("enter the time of booking in morning,afternoon,evening night ");
			time=sc.nextLine();
		
			switch(time) {
			case "morning","night":{
				fare=fare+(fare*0.20);
			}
			break;
			case "afternoon","evening":{
				System.out.println("no Pick hour time is scheduled here");
			}
			break;	
		}	
			if(hours>=10) {
				System.out.println("discount is added");
				fare=fare-(fare*0.20);
			}
			else {
				System.out.println("no discount is added here ");
			}
			
		}
		break;
		case "bus":{
			System.out.println("you have book the "+choice);
			fare=10*hours;
			System.out.println("enter the time of booking in morning,afternoon,evening night ");
			time=sc.nextLine();
		
			switch(time) {
			case "morning","night":{
				fare=fare+(fare*0.15);
			}
			break;
			case "afternoon","evening":{
				System.out.println("no Pick hour time is scheduled here");
			}
			break;	
		}	
			if(hours>=10) {
				System.out.println("discount is added");
				fare=fare-(fare*0.20);
			}
			else {
				System.out.println("no discount is added here ");
			}
			
		}
		break;
	}
		
		System.out.println(name+" "+email+" "+phone+" "+address+" "+age);
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("the ticket is getting print here ...............");
		System.out.println(name+"-----"+source+"-----"+destination+"-----"+" kilometer covered"+hours);
		System.out.println("the total fare of the journey is "+fare);
	
}
	else {
		System.out.println("the user is not authenicated to book the ticket please check the username or password");
	}
}
}
