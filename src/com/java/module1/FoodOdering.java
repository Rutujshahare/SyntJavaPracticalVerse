package com.java.module1;
import java.util.*;
public class FoodOdering {

	public static void main(String args[]) {
	String name;
	String phonenumber;
	int deliverychoice,actionchoice,quantity;
	double price,totalprice = 0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the person");
	name=sc.nextLine();
	System.out.println("enter the phone number of the person");
	phonenumber=sc.nextLine();
	
	List<String> transcations=new ArrayList<String>();
	
	System.out.println("1 .SHOP ");
	System.out.println("2.ONLINE");
	System.out.println("3 DOORSTEP");
	System.out.println("4 PARCEL");
	
	System.out.println("enter the choice from above");
	deliverychoice=sc.nextInt();
	int fee=0;
	String choice="";
	switch(deliverychoice) {
	case 1:{
		
		choice="SHOP";
		
	}
	break;
	
	case 2:{
		fee=50;
		choice="ONLINE";
		
	}
	break;
	
	case 3:{
		fee=60;
		choice="DOORSTEP";
		
	}
	break;
	
	case 4:{
		fee=50;
		choice="PARCEL";
		
	}
	break;
	}
	double charge=0;
	do {
		System.out.println("------------------------WELCOME TO THE RESTAURENT ------------------------");
		System.out.println("1.PIZZA");
		System.out.println("2.BURGER");
		System.out.println("3.SANDWICH");
		System.out.println("4.NOODLES");
		System.out.println("5.EXIT");
		
		System.out.println("please enter the thing you want to order");
		actionchoice=sc.nextInt();
		
		switch(actionchoice) {
		case 1:{
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			 price=90;
			  charge+=fee;
			totalprice+=price*quantity;
			String log="the oder is pizza with the quantity is "+quantity+" and the total price is"+totalprice;
			transcations.add(log);
		}
		break;
		
		case 2:{
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			 price=70;
			  charge+=fee;
			totalprice+=price*quantity;
			String log="the oder is burger with the quantity is "+quantity+" and the total price is"+totalprice;
			transcations.add(log);
		}
		break;
		
		case 3:{
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			 price=60;
			  charge+=fee;
			totalprice+=price*quantity;
			String log="the oder is sandwich with the quantity is "+quantity+" and the total price is"+totalprice;
			transcations.add(log);
		}
		break;
		
		case 4:{
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			 price=50;
			  charge+=fee;
			totalprice+=price*quantity;
			String log="the oder is noodles with the quantity is "+quantity+" and the total price is"+totalprice;
			transcations.add(log);
		}
		break;
		
		case 5:{
			System.out.println("----------------------BIILS--------------------------------------");
			System.out.println("the order are :");
			for(String s:transcations) {
				System.out.println("-----------------------------------");
				System.out.println(s);
			}
			
			System.out.println("the bills is "+totalprice);
			System.out.println("the delivery charge is "+charge);
			double allinone=totalprice+charge;
			
			double finalBill = totalprice;

			if (totalprice > 650) {  
			    System.out.println("Congrats! Free Delivery applied 🎉");
			    System.out.println("You saved Rs: " + charge);
			} else {
			    finalBill += charge;
			    System.out.println("Delivery charge = " + charge);
			}

			System.out.println("Final amount to pay = " + finalBill);

		}
		break;
	}
		
	}
	while(actionchoice!=5);
	}
}


