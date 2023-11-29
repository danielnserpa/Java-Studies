package NCI;
/*
* author Daniel
* 17 Oct 2023
* BorrowMoneyApp.java
*/

import java.util.Scanner;

public class BorrowMoneyApp{

	public static void main(String args[]){

		// Variables

			int numMonths;
			double amMoney;
			double totalRepay;
			double Interest;

		// Objects

		Scanner sc = new Scanner(System.in);
		BorrowMoney myB = new BorrowMoney();

		// Input

		System.out.println("How much money did you borrow? ");
		amMoney = sc.nextDouble();

		System.out.println("How many months are you going to need to pay? ");
		numMonths = sc.nextInt();

		myB.setamMoney(amMoney);
		myB.setnumMonths(numMonths);

		// Process - Call compute

		myB.compute();

		// Output

		Interest = myB.getInterest();
		totalRepay = Interest + amMoney;
		System.out.println("The ammount borrowed was: " + amMoney + "\nRATE: " + 0.03 + "\nInterest: " + Interest + "\nTotal Repay: " + totalRepay);



	}


}