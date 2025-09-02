package com.java.module1;
import java.util.*;
public class FactorialPyramids {

	public static void main(String args[]) {
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the rows");
		rows=sc.nextInt();
		
		System.out.println("1.FACTORIAL");
		System.out.println("2.PYRAMIDS");
		System.out.println("enter the choice :");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("this is a factorial number program");
			int fact=1;
			for(int i=1;i<=rows;i++) {
				fact=fact*i;
			}
			System.out.println("the factorial of the number is "+fact);
		}
		break;
		
		case 2:{
			System.out.println("enter the pyramids choice you want to print");
			System.out.println("1.normal");
			System.out.println("2 inverted");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:{
				System.out.println("this is a normail pyramids ");
				
				for(int i=0;i<rows;i++) {
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
			}
			break;
			
			case 2:{
				System.out.println("this is a inverted pyramids ");
				
				for(int i=0;i<rows;i++) {
					for(int j=rows;j>=i;j--) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
			}
			break;
			}
		}
		}
	}
}
