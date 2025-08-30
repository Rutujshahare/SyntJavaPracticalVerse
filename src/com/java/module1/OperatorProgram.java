package com.java.module1;

import java.util.*;

public class OperatorProgram {

	public static void main(String args[]) {
		int a, b, c, d, e, f, g, h;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for the integer a");
		a = sc.nextInt();
		System.out.println("enter the number for the integer b");
		b = sc.nextInt();
		System.out.println("enter the number for the integer c");
		c = sc.nextInt();
		System.out.println("enter the number for the integer d");
		d = sc.nextInt();
		
		//airthmetic operator:
		e=a+b;
		f=e-c;
		g=f*d;
		h=g/f;
		
		System.out.println("the value of the e is "+e);
		System.out.println("the value of the f is "+f);
		System.out.println("the value of the g is "+g);
		System.out.println("the value of the h is "+h);
		
		//relation operator:
		if(a>b&&a>c) {
			System.out.println("the number a is greater");
		}
		else if(b>a&&b>c) {
			System.out.println("the number b is greater");
		}
		else {
			System.out.println("the number c is greater");
			 
		}
		
		//assignment operator:
		
		System.out.println("enter the age of the student");
		int age=sc.nextInt();
		
		String eligible=age>18? "it is eligible":"not eiligible";
		System.out.println("the age is eligible or not "+eligible);
		
		//shift operator :
		
		int z=a>>b;//left shift operator
		int x=a<<b;
		System.out.println("the left shift operator is "+z);
		System.out.println("the right shift operator is "+x);
		
		//bitwise operator:
		 z=1&2;
		 System.out.println(z);
		 //unary operator :
		 a++;
		 ++b;
		 System.out.println(a+b);
		 
		 
		
		
	}
}
