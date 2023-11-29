package NCI;
/*
* author Daniel
* 17 oct 2023
* EggsApp.java
*/

import java.util.Scanner;

public class EggsApp{

	public static void main(String args []){

		// Variables

		int Eggs, Boxes, LeftOver;

		// Objects

		Scanner sc = new Scanner(System.in);
		Eggs myE = new Eggs();

		// Input

		System.out.println("How many eggs did you get this morning? ");
		Eggs = sc.nextInt();

		myE.setEggs(Eggs);

		// Compute

		myE.compute();

		// Output

		Boxes = myE.getBoxes();
		LeftOver = myE.getLeftOver();
		System.out.println("With " + Eggs + " Eggs, you will need " + Boxes + " boxes and will have " + LeftOver + " eggs left.");


	}

}