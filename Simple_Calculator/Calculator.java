package com.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		Double num1, num2, result;
		Scanner nobi=new Scanner(System.in);
		System.err.println("choose an operator: +,-,*,/ :");
		operator=nobi.next().charAt(0);
		System.out.print("enter the frist num:");
		num1=nobi.nextDouble();
		System.out.print("enter the second num:");
		num2=nobi.nextDouble();
		switch(operator) {
		case '+':
			result=num1+num2;
			System.err.println(num1+ " + " +num2+ " = " +result);
			break;
		case '-':
			result=num1-num2;
			System.err.println(num1+ " - " +num2+ " = " +result);
			break;
		case '*':
			result=num1*num2;
			System.err.println(num1+ " * " +num2+ " = " +result);
			break;
		case '/':
			result=num1 / num2;
			System.err.println(num1+ " / " +num2+ " = " +result);
			break;
		default:
			System.out.println("Invalid operator!");
	  }
	  nobi.close();
	}
}

