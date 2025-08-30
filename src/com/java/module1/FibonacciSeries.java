package com.java.module1;

import java.util.*;

public class FibonacciSeries {

	public static void main(String args[]) {
     int rows;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the fibonacci series for the rows you want in sequences");
     rows=sc.nextInt();
     
     int prev=1,next=2;
     int temp=0;
     System.out.print(prev+" "+next+" ");
     
     for(int i=2;i<=rows;i++) {
    	 temp=prev+next;
    	 prev=next;
    	 next=temp;
    	
    	 System.out.print(temp+" ");
     }
     
     
     
	}
}
