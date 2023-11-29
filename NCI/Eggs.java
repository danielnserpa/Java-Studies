package NCI;
/*
* author Daniel
* 17 oct 2023
* Eggs.java
*/

public class Eggs{

// Variables

private int Eggs;
private int Boxes;
private int LeftOver;

// Constructor

public Eggs(){

}

// Compute

public void compute(){

Boxes = Eggs/12;
LeftOver = Eggs % 12;

}

// Setters and Getters

public void setEggs(int Eggs){
	this.Eggs = Eggs;
}

public int getBoxes(){
	return Boxes;
}

	public int getLeftOver(){
		return LeftOver;

	}

}