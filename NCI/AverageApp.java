package NCI;
/*
* author Daniel
* 27 oct 2023
* AverageApp.java
*/

import javax.swing.JOptionPane;

public class AverageApp {

	public static void main (String args[]){

		// Variables

		int num, sum = 0;
		double average;

		// Object

		for (int i = 0; i < 10; i++){
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number: "));
			sum = sum + num;

		}

		average = sum / 10;
		JOptionPane.showMessageDialog(null, "Your average is: " + average);


	}

}