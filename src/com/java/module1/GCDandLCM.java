package com.java.module1;
import java.util.*;
public class GCDandLCM {

	public static int findGCD(int a,int b) {
	
		while(b!=0) {
		int temp=b;
		b=a%b;
		a=temp;
	}
		return a;
	}
	
	public static int findLCM(int a,int b) {
		
		int temp=(a*b)/findGCD(a,b);
		return temp;
	}
	
	public static int  findGCDArray(int[]arr) {
		int result=arr[0];
		for(int i=1;i<arr.length;i++) {
			result=findGCD(result,arr[i]);
		}
		return result;
	}
	
	public static int  findLCMArray(int[]arr) {
		int result=arr[0];
		for(int i=1;i<arr.length;i++) {
			result=findLCM(result,arr[i]);
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of digit you want GCD");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the "+n+" number here ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int gcd=findGCDArray(arr);
		int lcm=findLCMArray(arr);
		
		System.out.println("the gcd of the number is "+gcd);
		System.out.println("the LCM of the number is "+lcm);
	}
	}
	
	

