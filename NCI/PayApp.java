package NCI;
/*
* author Daniel Serpa
* 13 Oct 2023
* PayApp.java
*/

import java.util.Scanner;

public class PayApp{
	public static void main(String args[]) {

			// Variables

			double basicRate, basicHours, OTHours;
			double basicPay, OTPay, totalPay;

			// Objects

		Scanner sc = new Scanner(System.in);
		Pay myP = new Pay();

		// Input

		System.out.println("Please enter the basic pay rate: ");
		basicRate = sc.nextDouble();

		System.out.println("Please enter the basic hours: ");
		basicHours = sc.nextDouble();

		System.out.println("Please enter the Overtime hours: ");
		OTHours = sc.nextDouble();

		myP.setBasicRate(basicRate);
		myP.setBasicHours(basicHours);
		myP.setOTHours(OTHours);

		// Compute - Call Compute

		myP.compute();

		// Output

		basicPay = myP.getBasicPay();
		OTPay = myP.getOTPay();
		totalPay = myP.getTotalPay();

		System.out.println("Basic Rate: " + basicRate +
										" BasicHours: " + basicHours +
										" OTHours: " + OTHours +
										" BasicPay: " + basicPay +
										" OTPay: " + OTPay +
										" TotalPay: " + totalPay);

}

}