package NCI;
/*
* author Daniel Serpa
* 13 Oct 2023
* Pay.java
*/

public class Pay{

	// Variables

	private double basicRate, basicHours, OTHours;
	private double basicPay, OTPay, totalPay;

	// Constructor

	public Pay() {

	}

	// Compute Method

	public void compute() {
		basicPay = basicHours * basicRate;
		OTPay = OTHours * basicRate * 1.5;
		totalPay = basicPay + OTPay;

	}

		// Setters and getters

		public void setBasicRate(double basicRate) {
			this.basicRate = basicRate;

		}

		public void setBasicHours(double basicHours) {
			this.basicHours = basicHours;

		}

		public void setOTHours(double OTHours) {
			this.OTHours = OTHours;

		}
		// The public void is being used because they are SETTERS and dont need a return

		public double getBasicPay() {
			return basicPay;

		}

		public double getOTPay() {
			return OTPay;

		}

		public double getTotalPay() {
			return totalPay;

		}

		// The public double is being used because they are GETTERS and need a return

}