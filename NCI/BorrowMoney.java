package NCI;
/*
* author Daniel
* 17 Oct 2023
* BorrowMoney.java
*/

public class BorrowMoney{

	// Variables

	private double amMoney;
	private double numMonths;
	private double totalRepay;
	private double Interest;

	// Constructor

	public BorrowMoney(){

	}

	// Compute Method

	public void compute(){

		Interest = 0.03 * amMoney * numMonths;
		totalRepay = amMoney + Interest;

	}

	// Setters and getters

	public void setamMoney(double amMoney){
			this.amMoney = amMoney;
		}

	public void setnumMonths(double numMonths){
		this.numMonths = numMonths;
	}

	public double gettotalRepay(){
		return totalRepay;
	}

	public double getInterest(){
		return Interest;
	}


}