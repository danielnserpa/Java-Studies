package NCI;
/*
* author Daniel
*20 oct 2023
* StudentsUnionApp.java
*/

import java.util.Scanner;

public class StudentsUnionApp{

	public static void main(String args[]){

		// Variables

		int Caps;
		int Shirts;
		int Hoodies;
		int Total;

		// Objects

		Scanner sc = new Scanner(System.in);
		StudentsUnion myS = new StudentsUnion();

		// Input

		System.out.println("How many caps did you buy? ");
		Caps = sc.nextInt();

		System.out.println("How many shirts did you buy? ");
		Shirts = sc.nextInt();

		System.out.println("How many hoodies did you buy? ");
		Hoodies = sc.nextInt();



		myS.setCaps(Caps);
		myS.setShirts(Shirts);
		myS.setHoodies(Hoodies);

		// Compute method

		myS.compute();

		// Output

		Total = (Caps * 5) + (Shirts * 10) + (Hoodies * 20);
		System.out.println("Your total is: " + Total);

	}


}
