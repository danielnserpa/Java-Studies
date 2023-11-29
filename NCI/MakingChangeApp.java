package NCI;
/*
* Author Daniel
* 06 Oct 2023
* MakingChangeApp.java
*/

import java.util.Scanner;

public class MakingChangeApp {

	public static void main (String args[]) {

		// Variables

		int cost, cash, change, leftOver;
		int num100, num50, num20, num10, num5, num2, num1;

		// Objects

		Scanner sc = new Scanner(System.in);

		// Input

		System.out.println("Please enter the cost of your item:");
		cost = sc.nextInt();

		System.out.println("Please enter the cash amount tendered:");
		cash = sc.nextInt();

		// Process

		change = cash - cost;
		num20 = change / 20;
		num10 = change / 10;
		num5 = change / 5;
		num2 = change / 2;
		num1 = change / 1;


		// Output

		System.out.println("Your change is " + change);

		// Calc 50s
		num50 = change / 50;
		leftOver = change % 50;

		// Output 50s

		System.out.println("50 bills: " + num50);
		System.out.println("The left over ammount is: " + leftOver);

		// Calc 20s
		num20 = leftOver / 20;
		leftOver = leftOver % 20;

		// Output 20s
		System.out.println("20 bills: " + num20);
		System.out.println("The left over ammount is: " + leftOver);

		// Calc 10s
		num10 = leftOver / 10;
		leftOver = leftOver % 10;

		// Output 10s
		System.out.println("10 bills: " + num10);
		System.out.println("The left over ammount is: " + leftOver);

		// Calc 5s
		num5 = leftOver / 5;
		leftOver = leftOver % 5;

		// Output 5s
		System.out.println("5 bills: " + num5);
		System.out.println("The left over ammount is: " + leftOver);

		// Calc 2s
		num2 = leftOver / 2;
		leftOver = leftOver % 2;

		// Output 2s
		System.out.println("2 coins: " + num2);
		System.out.println("The left over ammount is: " + leftOver);

		// Calc 1s
		num1 = leftOver / 1;
		leftOver = leftOver % 1;

		// Output 1s
		System.out.println("1 coins: " + num1);
		System.out.println("The left over ammount is: " + leftOver);

		// IF THERE'S NO NEED TO USE A SPECIFIC TYPE OF BILL, HOW DO I SKIP THIS INFORMATION ON THE PROGRAM?

	}
}





