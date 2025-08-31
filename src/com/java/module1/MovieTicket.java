package com.java.module1;
import java.util.*;
public class MovieTicket {
public static void main(String args[]) {
	String name,phone;int age;
	String city,theatre;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the person");
	name=sc.nextLine();
	System.out.println("enter the phone number of the person");
	phone=sc.nextLine();

	
	System.out.println("-------------------------Movie System------------------");
	System.out.println("enter the city of the theatre you want to book ");
	city=sc.nextLine();
	System.out.println("emter the theatre name of the city you have been selected");
	theatre=sc.nextLine();
	
	String username=city+theatre;
	String password=name+phone.substring(6);
	
	System.out.println("please enter the username and the password for booking the ticket");
	
	System.out.println("enter the username of the person");
	String username1=sc.nextLine();
	System.out.println("enter the password of the person");
	String password1=sc.nextLine();
	
	
	
	if(username1.equalsIgnoreCase(username)&&password1.equalsIgnoreCase(password)) {
		System.out.println("You have been authenicated !!!!!!!!!");
		System.out.println("1.MORNING");
		System.out.println("2.AFTERNOON");
		System.out.println("3.EVENING");
		System.out.println("4.NIGHT");
		System.out.println("enter the choice of your time");
		int choice=sc.nextInt();
		
		double price=0;
		
		String timeset="";
		switch(choice) {
		
		case 1:{
			System.out.println("the show is morning time");
			price=200;
			timeset="MORNING TIME";
			
		}
		break;
		
		case 2:{
			System.out.println("the show is after noon time");
			price=200;
			timeset="AFTERNOON TIME";
		}
		break;
		
		case 3,4:{
			System.out.println("the show is  peak time");
			price=200;
			timeset="PEAK TIME";
			price+=price*0.20;
		}
		break;
		
		default:System.out.println("invalid time choosen");
		}
		
		System.out.println("you have choosen the "+timeset);
		System.out.println("please enter the promocode if you have in order to discount the ticket price");
		String promocode=sc.nextLine();
		
		sc.nextLine();
		System.out.println("enter the age of the person");
		age=sc.nextInt();
		sc.nextLine();
		
		if(age>=18) {
			System.out.println("you are eligible to watch the movies");
			System.out.println("------------------TICKET DETAILS-------------------");
			System.out.println("NAME :"+name);
			System.out.println("PHONE :"+phone);
			System.out.println("THEATRE"+theatre);
			
			System.out.println("the price of the ticket is "+price);
			System.out.println("the time of the show is "+timeset);
			
		
			
			if(promocode.equalsIgnoreCase("MOVIE50")) {
				System.out.println("the promo code is applied!!!!!!");
				price-=price-50;
				System.out.println("the final price is "+price);
				
			}
			else {
				System.out.println("the final price is "+price);
			}
		}
	}
	
}
}
