package NCI;
/*
* author Daniel
* 27 oct 2023
* AverageApp.java
*/

import javax.swing.JOptionPane;

public class AverageApp2 {

	public static void main (String args[]){

		// Variables

		int nums [] = new int [5];
		double average;
		int min, max;

		// Object

		Average2 myA = new Average2();

		// Input

		for(int i = 0; i < nums.length; i++){
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number " + (i + 1)));
		}


		 // Process

		myA.setnums(nums);

		myA.compute();

		myA.computeMin();

		myA.computeMax();


		// Output

		average = myA.getaverage();
		min = myA.getmin();
		max = myA.getmax();

		JOptionPane.showMessageDialog(null, " The average is: " + average + "\nMin: " + min + "\nMax: " + max);




		}




	}

