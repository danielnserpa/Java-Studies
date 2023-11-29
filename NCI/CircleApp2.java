package NCI;
/*
* author Daniel
* 03 Oct 2023
* CircleApp2.java
*/

import java.util.Scanner;

public class CircleApp2 {

	public static void main(String args[]){

		// Variables
		double area;
		double radius;
		double diameter;
		final double PI = 3.1428;

		// Objects
		Scanner sc = new Scanner(System.in);

		// Input
		System.out.println("What's the diameter of the circle?");
		diameter = sc.nextInt();

		// Process
		radius = diameter/2;
		area = PI * radius * radius;

		// Output

		System.out.println("Your circle has a radius of " + radius + " and an area of " + area);


	}
}


