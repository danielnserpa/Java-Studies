package NCI;
/*
* author Daniel
*21 oct 2023
* Dogs.java
*/

public class Temperatura {

// Variables

private int C;
private double F;

// Constructor

public Temperatura(){

}

// Compute

public void compute(){

F = (C * 9 / 5) + 32;

}

// Setters and getters

public void setC (int C) {
this.C = C;

}

public double getF (){
	return F;

}


}