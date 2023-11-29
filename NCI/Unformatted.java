package NCI;
/*
*autor Daniel Nascimento
*07 oct 2023
* Unformatted.java
*/

	import java.util.Scanner;

	public class Unformatted {

	public static void main(String args[]) {

		Scanner sc = new Scanner (System.in);

		final double X = 13.45;
		final int Y = 34;
		double salary;
		int num;

		System.out.println("Enter an integer less than 70: ");
		num = sc.nextInt();
		salary = num*X;


		System.out.println("Wages: " + salary);
		System.out.println("X = " + X);
		System.out.println("X + Y = " + (X + Y));

		// I didn't understand what X + Y means and why it's here.


	}
}