package NCI;
/*
* author Daniel
* 22 oct 2023
* Meters.java
*/

public class Meters{

	// Variables

	private int Cm;
	private int Mt;

// Constructor

public Meters(){

}

// Compute

public void compute(){

Cm = Mt * 100;

}

// Process

public void setMt(int Mt){
	this.Mt = Mt;
}

public int getCm(){
	return Cm;
}



}