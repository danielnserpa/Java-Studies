package NCI;
/*
* author Daniel
* 07 oct 2023
* Temperature.java
*/

public class Temperature{

	// Variables

	private double Cel, Fah;

	// Constructor

	public Temperature(){

	}

	// Compute method

	public void compute(){

		Fah = (Cel * 9 / 5) + 32;

	}

	// Setters and Getters

	public void setCel(double Cel){
		this.Cel = Cel;

	}

	public double Fah(){
		return Fah;

	}



}