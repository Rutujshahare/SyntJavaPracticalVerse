package com.java.module1;

import java.util.*;

public class BankSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double balance=1000;
		double totalfees=0;
		
		int actionchoice,bankchoice;
		
		List<String> transactions=new ArrayList<String>();
		
		System.out.println("1.SBI---->processing fee is 6RS");
		System.out.println("2.ICICI---->processing fee is 7RS");
		System.out.println("3.HDFC---->processing fee is 8RS");
		System.out.println("enter the bank choice ");
		bankchoice=sc.nextInt();
		
		double fee=0;
		String bankname="";
		switch(bankchoice) {
		case 1:{
			fee=6;
			bankname="SBI";
		}
		break;
		case 2:{
			fee=7;
			bankname="ICICI";
		}
		break;
		case 3:{
			fee=8;
			bankname="HDFC";
		}
		break;
		default:
			System.out.println("the invalid choice ");
			return;
		}
		
		System.out.println("the bank name selected is "+bankname);
		
		do {
			System.out.println("------------SUMMARY ACTION-----------------");
			System.out.println("1 Deposit");
			System.out.println("2 Withdraw");
			System.out.println("3 show balance");
			System.out.println("EXIT");
			System.out.println("enter the action you want to perform");
			actionchoice=sc.nextInt();
			
			switch(actionchoice) {
			case 1:{
				System.out.println("enter the amount you want to deposit");
				double deposit=sc.nextDouble();
				balance+=deposit-fee;
				totalfees+=fee;
				String log="deposited ------"+deposit+"fees charged is "+fee+" balance --------"+balance;
				transactions.add(log);
				System.out.println(log);
				
			}
			break;
			
			case 2:{
				System.out.println("enter the amount you want to withdraw");
				double withdraw=sc.nextDouble();
				if(balance>0&&balance>withdraw+fee) {
					balance-=withdraw+fee;
					totalfees+=fee;
					String log="withdraw ------"+withdraw+"fees charged is "+fee+" balance --------"+balance;
					transactions.add(log);
					System.out.println(log);
				}
				else {
					System.out.println("insufficient funds");
				}
				
			}
			break;
			
			case 3:
			{
				String log="current balance====="+balance;
				transactions.add(log);			
			}
			break;
			
			case 4:{
				System.out.println("---------------SUMMARY------------------------");
				System.out.println("FINAL BALANCE -----------------------"+balance);
				System.out.println("TOTAL FEES CHARGES ------------------"+totalfees);
				System.out.println("-----------------transaction history------------------------");
				for(String s:transactions) {
					System.out.println(s);
				}
			}
			break;
			default:
				System.out.println("action not founds -----------------------------");
		}
		}
		while(actionchoice!=4);
		

	}
}
