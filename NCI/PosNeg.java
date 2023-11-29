package NCI;
/*
* author Daniel
* 29 oct 2023
* PosNeg.java
*/

public class PosNeg {

	// Variables

	private int num;
	private String message;

	// Constructor

	public PosNeg(){

	}

	// Compute

	public void compute(){

		if (num < 0){
			message = ("The input number is negative");
		}
		else if (num > 0){
			message = ("The input number is positive");
		}
		else {
			message = ("The input number is 0, which is neither negative nor positive");
		}


	}

	// Setters and getters

	public void setnum(int num){
	this.num = num;
}

public String getmessage(){
	return message;
}




}