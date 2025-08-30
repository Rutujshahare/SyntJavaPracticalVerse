package com.java.module1;
import java.util.*;
public class PyramidsProblem {
public static void main(String args[]) {
	int rows;
	String choice;
	Scanner sc=new Scanner(System.in);
	           System.out.println("enter the rows upto how much you want to print the *");
	           rows=Integer.parseInt(sc.nextLine());
	           System.out.println("enter the choice of the pyramids you need (normal,inverted)");
	           choice=sc.nextLine();
	           switch(choice) {
	           case "normal":{
	        	   System.out.println("the normail pyramids is getting printed here :");
	        	   System.out.println("you have enter the rows "+rows);
	        	   
	        	   for(int i=0;i<rows;i++) {
	        		   for(int j=0;j<=i;j++) {
	        			   System.out.print("*");
	        		   }
	        		   System.out.println(" ");
	        	   }
	           }
	           break;
	           
	           case "inverted":{
	        	   System.out.println("the inverted pyramids is getting printed here :");
	        	   System.out.println("you have enter the rows "+rows);
	        	   
	        	   for(int i=0;i<rows;i++) {
	        		   for(int j=rows;j>i;j--) {
	        			   System.out.print("*");
	        		   }
	        		   System.out.println(" ");
	        	   }
	           }
	           break;
	           }
	
}
}
