package NCI;
/*
* author Daniel
* 10 oct 2023
* ExamMarksApp.java
*/

import java.util.Scanner;

public class ExamMarksApp{

	public static void main (String args []){

		// Variables

		int mark, counter = 0;
		double sum = 0, avg;
		String moreMarks;

		// Objects

		Scanner sc = new Scanner(System.in);
		do{

			do{
				System.out.println("Please enter mark " + (counter + 1) + ": ");
				mark = sc.nextInt();

				if (mark < 0 || mark > 100) {
					System.out.println ("Invalid mark");
					System.out.println (" ");
				}
					else {
						System.out.println ("Mark computed");
						System.out.println (" ");

					}

			}while(mark < 0 || mark > 100);
			counter++;
			sum = sum + mark;
		System.out.println("Do you need to enter more marks? ");
		moreMarks = sc.next();
		} while(moreMarks.equalsIgnoreCase("yes"));

		avg = sum / counter;
		System.out.println("The average mark is: " + avg);



	}
}