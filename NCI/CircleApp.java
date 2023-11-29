package NCI;
/*
* author Daniel
* 03 Oct 2023
* CircleApp.java
*/

import java.util.Scanner;

public class CircleApp {

	public static void main(String args[]){

		// Variables
		double area;
		int radius;
		final double PI = 3.1415;

		// Objects
		Scanner sc = new Scanner(System.in);


		// Input
		System.out.println("What's the radius of the circle?");
		radius = sc.nextInt();

		// Process
		area = PI * radius * radius;


		// Output

		System.out.println("Your circle has an area of " + area);


	}
}


