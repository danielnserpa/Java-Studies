package NCI;
/*

* RandomNumApp.java

* @author Enda

* 16/6/2022

*/

import javax.swing.JOptionPane;



public class RandomNumApp{

	public static void main(String args[]){

		// Variables

			//	double randomNumDblby10 = (randomNumDbl * 10);

			//	int randomNumInt = (int) (randomNumDblby10);

			//	int randomNumIntPlusOne = randomNumInt +1;


		int guess;
		int random;
		String message;

		// Objects

		RandomNum myR = new RandomNum();

		// Input

		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number from 1 to 10: "));

		myR.setguess(guess);

		// Process

		myR.compute();

		// Output

		random = myR.getrandom();
		message = myR.getmessage();

		JOptionPane.showMessageDialog(null, "The secret number was: " + random);

		JOptionPane.showMessageDialog(null, message);


		// Output

		// JOptionPane.showMessageDialog(null, "randomNumDbl: " + randomNumDbl

						//	+ "\nrandomNumDbl * \"10\": " + randomNumDblby10

					//		+ "\nrandomNumInt: " + randomNumInt

						//	+ "\nrandomNumIntPlusOne: " + randomNumIntPlusOne);



		// generate a single number between 1 and 10

		// in a single statement





	}

}