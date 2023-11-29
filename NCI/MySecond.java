package NCI;
/*
* Author Daniel
* 26 Sept 2023
* MySecond.java
*/
import java.util.Scanner;

	public class MySecond {

			public static void main(String args []) {
				// Declare variables
				String name;
				int age;

				// Declare and Create object
				Scanner sc = new Scanner(System.in);

				// Input
				System.out.println("Please enter your name");
				name = sc.next();

				System.out.println("Please enter your age");
				age = sc.nextInt();

				System.out.println("Hello " + name + ". Your age is " + age);


		} // main

} // class
