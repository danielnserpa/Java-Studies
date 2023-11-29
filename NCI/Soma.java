package NCI;
/*
* author Daniel
* 21 oct 2023
* Soma.java
*/

public class Soma {

	// Variables

	private int Num1, Num2;
	private int Soma, Subt;

	// Constructor

	public Soma() {

	}

	// Compute

	public void compute (){

		int Soma = Num1 + Num2;
		int Subt = Num1 - Num2;

}

		// Setters and getters

		public void setNum1(int Num1){
		this.Num1 = Num1;
	}

	public void setNum2(int Num2){
		this.Num2 = Num2;
	}

	public int getSoma(){
		return Soma;
	}

	public int getSubt(){
		return Subt;
	}



}