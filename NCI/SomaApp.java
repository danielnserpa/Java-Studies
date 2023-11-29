package NCI;
/*
* author Daniel
* 21 oct 2023
* SomaApp.java
*/

import java.util.Scanner;

public class SomaApp {

	public static void main (String args[]){

		// Variables

		int Num1, Num2;
		int Soma, Subt;

		// Objects

		Scanner sc = new Scanner(System.in);
		Soma myS = new Soma();

		// Input

		System.out.println("Choose the first number: ");
		Num1 = sc.nextInt();

		myS.setNum1(Num1);

		System.out.println("Choose the second number: ");
		Num2 = sc.nextInt();

		myS.setNum2(Num2);

		System.out.println("--------------");
		System.out.println("The chosen numbers were " + Num1 + " and " + Num2);
		System.out.println("--------------");

		// Compute method

		myS.compute ();

			Soma = Num1 + Num2;
			Subt = Num1 - Num2;

			// Output

System.out.println ("The sum between " + Num1 + " and " + Num2 + " is: " + Soma + " and the difference is " + Subt);

	}

}