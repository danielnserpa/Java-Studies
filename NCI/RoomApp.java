package NCI;
/*
* author Daniel Nascimento
* 03 Sept 2023
* RoomApp.java
*/

import java.util.Scanner;

	public class RoomApp {

		public static void main(String args[]) {

		// Variables
		int area, perimeter;
		int length, width;

		// Objects
		Scanner sc = new Scanner(System.in);

		// Input
		length = sc.nextInt();
		width = sc.nextInt();
		area = length * width;
		perimeter = 2 * (length+width);

		// Output
		System.out.println("What's the room length?");
		length = sc.nextInt();

		System.out.println("What's the room width?");
		width = sc.nextInt();

		System.out.println("A room with length " + length + " and width " + width + " has area " + area + (" and perimeter ") + perimeter);


	}
}

