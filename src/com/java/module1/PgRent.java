package com.java.module1;
import java.util.*;
public class PgRent {
public static void main(String args[]) {
	String name;
	String email;
	String phone;
	String address;
	String age;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the person");
	name=sc.nextLine();
	System.out.println("enter the email of the person");
	email=sc.nextLine();
	System.out.println("enter the phone number of the person");
	phone=sc.nextLine();
	System.out.println("enter the age of the person");
	age=sc.nextLine();
	
	String pgname;
	int roomno;
	double price=0;
	String username="RC PG";
	
	System.out.println("enter the pg name of the person");
	pgname=sc.nextLine();
	
	System.out.println("enter the room no of the person");
	roomno=sc.nextInt();
	if(username.equalsIgnoreCase(pgname)&&roomno>101) {
		
		System.out.println("enter the room you stays from the below ");
		System.out.println("1.2 sharing");
		System.out.println("2.3 sharing");
		System.out.println("3.deluxe room");
		System.out.println("enter the choice of the room");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("this is a 2 sharing rooms");
			price=160;
			
		}
		break;
		case 2:{
			System.out.println("this is a 3 sharing rooms");
			price=120;
			
		}
		break;
		case 3:{
			System.out.println("this is a deluxe rooms");
			price=210;
			
		}
		break;
		}
		
		System.out.println("enter the number of the days stayed");
		int days=sc.nextInt();
		double totalprice=price*days;
		
		System.out.println("enter the amount payed");
		double amount=sc.nextDouble();
		if(amount>=totalprice) {
			System.out.println(name+" "+email+"  "+phone+" "+age);
			System.out.println("please return the amount "+(amount-totalprice));
		}
		else {
			System.out.println("please pay the total amount the amount you need to pay again is "+(amount-totalprice));
		}
	}
}
}
