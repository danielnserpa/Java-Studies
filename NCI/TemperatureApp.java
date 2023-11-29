package NCI;
/*
* author Daniel
* 07 oct 2023
* TemperatureApp.java
*/

import java.util.Scanner;

public class TemperatureApp{
	public static void main(String args[]){

		// Variables

		double Cel, Fah;

		// Objects

		Scanner sc = new Scanner(System.in);
		Temperature myT = new Temperature();

		// Input

		System.out.println("What's the temperature in Celsius? ");
		Cel = sc.nextDouble();

		myT.setCel(Cel);

		// Compute

		myT.compute();

		// Output

		Fah = (Cel * 9 / 5) + 32;
		System.out.println(" The temperature in Fahrenheit is: " + Fah);



	}


}

