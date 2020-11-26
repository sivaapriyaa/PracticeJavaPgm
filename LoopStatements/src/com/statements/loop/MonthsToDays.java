package com.statements.loop;

import java.util.Scanner;

public class MonthsToDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		switch (input) {
		case 1: {
			System.out.println("January has 31 days");
			break;
		}
		case 2: {
			System.out.println("February has 28 days if leap year 29 days");
			break;
		}
		case 3: {
			System.out.println("March has 31 days");
			break;
		}
		default:
			System.out.println("Enter number between 1-12");

		}

	}

}
