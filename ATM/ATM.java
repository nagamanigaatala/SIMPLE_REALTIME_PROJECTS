package com.ATM;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int balance=100000, withdraw, deposit;
		Scanner nobi= new Scanner(System.in);
		while(true) {
			System.out.println("Automated Teller Machin");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for Check Balane");
			System.out.println("choose 4 for exit");
			System.out.println("choose the operation you want to perform:");
			int choice=nobi.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter money to withdrawn:");
				//get the withdraw money from user  
				withdraw=nobi.nextInt();
				if(balance>=withdraw) {
					balance=balance-withdraw;
					System.out.println("please collect your money");
				}
					else{
						//show custom error message   
						System.out.println("Insufficent Balance");
					}
					System.out.println("");
					break;
			case 2:
				System.out.println("enter money to be deposited:");
				deposit=nobi.nextInt();
				balance=balance+deposit;
				System.out.println("your money has been successfully deposited");
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance:"+balance);
				System.out.println("");
				break;
			case 4:
				//exit from the menu  
				System.exit(0);
			}
		}
	}
}
