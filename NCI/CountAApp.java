package NCI;
/*
* author Daniel
* 10 oct 2023
* CountAApp.java
*/

import java.util.Scanner;

public class CountAApp {

	public static void main (String args[]){

		// Variables

		String word;
		int numA;

		// Objects

		Scanner sc = new Scanner(System.in);
		CountA myC = new CountA();


		// Input

		System.out.println ("Choose a word: ");
		word = sc.next();


		// Process - call Compute

		myC.setword(word);
		myC.compute();

		// Output

		numA = myC.getnumA();
		System.out.println("The number of A letters is: " + numA);
	}

}