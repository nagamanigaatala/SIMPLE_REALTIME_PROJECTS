package com.Number_Guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class Num_Guessing_Game {

	public static void main(String[] args) {
		generateRandom();
	}

	private static void generateRandom() {
		Random rand=new Random();
		int randomNum = rand.nextInt(11);
		guess(randomNum);
	}

	public static void guess(int randomNum) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("");
		System.err.println("Number Guessing Game");
		System.out.println("Guess a number 0-10");
		int guess=nobi.nextInt();
		System.out.println("");
		while (guess<0 || guess>10) {
			System.err.println("Guess a number between 0-10 :");
			guess=nobi.nextInt();
			System.out.println("");		
		}
		int tries=0;
		while(guess!=randomNum) {
			tries++;
			System.out.println("Guess again: ");
			System.out.println("wrong Guess!");
			
			guess=nobi.nextInt();
			System.out.println("");
			while (guess<0 || guess>10) {
				System.err.println("Guess a number between 0-10 :");
				guess=nobi.nextInt();
				System.out.println("");		
			}
		}
		System.out.println("Correct Answer, You Won!");
		System.out.println("Wrong Tries: " +tries);
		System.out.println("");
		System.out.println("Press 1 to play again.");
		System.out.println("press 0 exit.");
		int choice=nobi.nextInt();
		if(choice ==1)
			generateRandom();
		else
			return;
		nobi.close();
	}

}
