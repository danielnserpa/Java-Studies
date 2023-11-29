package NCI;
/*
* author Daniel
* 27 oct 2023
* GuessApp.java
*/
import javax.swing.JOptionPane;

public class GuessApp {

	public static void main (String args[]){

		// Variables

		int random;
		int userGuess;
		int numGames = 0;
		String message;
		boolean userWin;

		// Objects

		Guess myG = new Guess();

		// Input



do {
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number from 0 to 10"));
		myG.setuserGuess(userGuess);

		// Process

		myG.compute();
		numGames++;

		// Output

		random = myG.getrandom();
		message = myG.getmessage();
		userWin = myG.getuserWin();



		JOptionPane.showMessageDialog (null, message + "\nYour chosen number was " + userGuess + " and the secret number was: " + random);


		} while ((numGames < 2) && (userWin == false));
	}
}