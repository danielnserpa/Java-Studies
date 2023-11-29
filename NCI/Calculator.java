package NCI;
/*
* author Daniel
* 07 oct 2023
* Calculator.java
*/

public class Calculator{

	// Variables

	private int Num1, Num2;
	private int Sum, Diff;

	// Constructor

	public Calculator(){

	}

	// Compute

	public void compute(){

	Sum = Num1 + Num2;
	Diff = Num1 - Num2;

	}

	// Setters and getters

	public void setNum1(int Num1){
		this.Num1 = Num1;
	}

	public void setNum2(int Num2){
		this.Num2 = Num2;
	}

		public int getSum(){
			return Sum;
	}


		public int getDiff(){
			return Diff;
	}




}