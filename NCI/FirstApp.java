package NCI;
/*
* author Daniel
*10 oct 2023
* FirstApp.java
*/

import java.util.Scanner;

public class FirstApp{

	public static void main (String args []){

		// Variables

		String name, message;

		// Objects

		Scanner sc = new Scanner(System.in);
		First myF = new First();

		// Input

		System.out.println("Please enter your name: ");
		name = sc.next();

		// Process - call compute

		myF.setName(name);
		myF.compute();

		// Output

		message = myF.getMessage();
		System.out.println(message);


	}
}
