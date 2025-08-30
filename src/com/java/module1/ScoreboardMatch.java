package com.java.module1;
import java.util.*;
public class ScoreboardMatch {
public static void main(String args[]) {
	String team1,team2;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the home team name");
	team1=sc.nextLine();
	System.out.println("enter the home team name");
	team2  =sc.nextLine();
	
	System.out.println("enter the match played today ");
	String matchdemo= sc.nextLine();
	
	if(matchdemo.equalsIgnoreCase(team1)||matchdemo.equalsIgnoreCase(team2)) {
		System.out.println("the match is founds today ");
		System.out.println(team1+" v/s "+team2);
		
		System.out.println("enter the score of the team");
		System.out.println(team1+"--------------------------------team1--------------------------"+team1);
		int t11,t12,t13,t14,t15;
		int t21,t22,t23,t24,t25;
		
		System.out.println("the 1 batsman score of the "+team1+" is" );
		t11=sc.nextInt();
		System.out.println("the 2 batsman score of the "+team1+" is" );
		t12=sc.nextInt();
		System.out.println("the 3 batsman score of the "+team1+" is" );
		t13=sc.nextInt();
		System.out.println("the 4 batsman score of the "+team1+" is" );
		t14=sc.nextInt();
		System.out.println("the 5 batsman score of the "+team1+" is" );
		t15=sc.nextInt();
		
		int team1total=t11+t12+t13+t14+t15;
		System.out.println("the score of the team  is "+team1total);
		
		System.out.println(team2+"--------------------------------team2--------------------------"+team2);
		
		System.out.println("the 1 batsman score of the "+team2+" is" );
		t21=sc.nextInt();
		System.out.println("the 2 batsman score of the "+team2+" is" );
		t22=sc.nextInt();
		System.out.println("the 3 batsman score of the "+team2+" is" );
		t23=sc.nextInt();
		System.out.println("the 4 batsman score of the "+team2+" is" );
		t24=sc.nextInt();
		System.out.println("the 5 batsman score of the "+team2+" is" );
		t25=sc.nextInt();
		int team2total=t21+t22+t23+t24+t25;
		System.out.println("the score of the team  is "+team2total);
		
		if(team1total>team2total) {
			System.out.println("the team1 "+team1+" has won the match..............by "+(team1total-team2total));
			if(t11>t12&&t11>t13&&t11>t14&&t11>t15) {
				System.out.println("the man of the match is "+team1+"1 batsman and the score is "+t11);
			}
			else if(t12>t11&&t12>t13&&t12>t14&&t12>t15) {
				System.out.println("the man of the match is "+team1+"2 batsman and the score is "+t12);
			}
			else if(t13>t12&&t13>t11&&t13>t14&&t13>t15) {
				System.out.println("the man of the match is "+team1+"3 batsman and the score is "+t13);
			}
			else if(t14>t12&&t14>t13&&t14>t11&&t14>t15) {
				System.out.println("the man of the match is "+team1+"4 batsman and the score is "+t14);
			}
			else {
				System.out.println("the man of the match is "+team1+"5 batsman and the score is "+t15);
			}
		}
		else {
			System.out.println("the team2 "+team2+" has won the match..............by "+(team2total-team1total) );
			if(t21>t22&&t21>t23&&t21>t24&&t21>t25) {
				System.out.println("the man of the match is "+team2+"1 batsman and the score is "+t21);
			}
			else if(t22>t21&&t22>t23&&t22>t24&&t22>t25) {
				System.out.println("the man of the match is "+team2+"2 batsman and the score is "+t22);
			}
			else if(t23>t22&&t23>t21&&t23>t24&&t23>t25) {
				System.out.println("the man of the match is "+team2+"3 batsman and the score is "+t23);
			}
			else if(t24>t22&&t24>t23&&t24>t21&&t24>t25) {
				System.out.println("the man of the match is "+team2+"4 batsman and the score is "+t24);
			}
			else {
				System.out.println("the man of the match is "+team2+"5 batsman and the score is "+t25);
			}
		}
		
	}
	else {
		System.out.println("no match founds here ");
	}
	
}
}
