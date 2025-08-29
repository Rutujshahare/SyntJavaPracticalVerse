package com.java.module1;

import java.util.*;

public class TabularData {
	public static String builderformat(int[] width) {
		StringBuilder format = new StringBuilder();
		for (int w : width) {
			format.append("| %-").append(w).append("s");     
		}
		format.append("|\n");
		return format.toString();
		
		 
	}
	
	public static String builderline(int[] width) {
		StringBuilder line = new StringBuilder();
		line.append("+");
		for (int w : width) {
			line.append("-".repeat(w+2));
			line.append("+");
		}
		return line.toString();
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		String firstname,lastname,username,mail,company,address,password;
		List<String[]> data=new ArrayList<>();
		String[] header= {"FULL NAME","EMAIL ADDRESS","COMPANY","ADDRESS"};
		data.add(header);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the person you want to enter");
		int n=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the firstname of the "+i+1+" user");
			firstname=sc.nextLine();
			
			System.out.println("enter the lastname of the "+i+1+" user");
			lastname=sc.nextLine();
			
			System.out.println("enter the company of the "+i+1+" user");
			company=sc.nextLine();
			
			System.out.println("enter the address of the "+i+1+" user");
			address=sc.nextLine();
			
			String fullname=firstname+"."+lastname;
			
			 mail=fullname+"@"+".net";
			 
			 data.add(new String[] {fullname,mail,company,address});
			 }
		
		String correctedusername="admin";
		String correctedpassword="admin123$";
		
		System.out.println("enter the username of the user");
		username=sc.nextLine();
		
		System.out.println("enter the password of the user");
		password=sc.nextLine();
		
		if(!username.equalsIgnoreCase(correctedusername)&&!password.equalsIgnoreCase(correctedpassword)) {
			System.out.println("the database access is not matched");
			return ;
			
		}
		else {
			System.out.println("waiting to display data .....................");
			Thread.sleep(500);
		}
		
		//providing the width :
		
		int fullnamewidth=0,emailwidth=0,companywidth=0,addresswidth=0;
		for(String[] rows:data) {
			fullnamewidth=Math.max(fullnamewidth, rows[0].length());
			emailwidth=Math.max(emailwidth, rows[1].length());
			companywidth=Math.max(companywidth, rows[2].length());
			addresswidth=Math.max(addresswidth, rows[3].length());
			
		}
		fullnamewidth+=2;
		emailwidth+=2;
		companywidth+=2;
		addresswidth+=2;
		
		int[]width= {fullnamewidth,emailwidth,companywidth,addresswidth};
		
		String format=builderformat(width);
		String line=builderline(width);
		
		System.out.println("\n"+line);
		System.out.printf(format,header[0],header[1],header[2],header[3] );
		System.out.println(line);
		
		for(int i=1;i<data.size();i++) {
			String[] rows=data.get(i);
			System.out.printf(format, rows[0],rows[1],rows[2],rows[3]);
			System.out.println(line);
		}
		
		
		
	}
}
