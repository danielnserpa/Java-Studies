package NCI;
/*
* author Daniel
* 07 oct 2023
* Celsius.java
*/

	import java.util.Scanner;

	public class Celsius {

		public static void main(String args[]) {

		// Variables

		double celsius, fahrenheit;

		// Object

		Scanner sc = new Scanner(System.in);

		// Input

		System.out.println("Please state the temperature in Celsius: ");
		celsius = sc.nextDouble();

		// Process

		fahrenheit = (celsius * 9 / 5) + 32;

		// Output

		System.out.println("Your temperature in Celsius, when converted to Fahrenheit is: " + fahrenheit);

		}

	}