package NCI;
/*
* author Daniel
* 27 oct 2023
* GuessApp3.java
*/
import javax.swing.JOptionPane;

public class GuessApp3 {

	public static void main (String args[]){

		// Variables

		int random;
		int userGuess;
		int numGames = 0, numUserWin = 0, numCompWin = 0;
		String message;

		// Objects

		Guess3 myG = new Guess3();

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
		numUserWin = myG.getnumUserWin();
		numCompWin = myG.getnumCompWin();

		JOptionPane.showMessageDialog (null, message + "\nYour chosen number was " + userGuess + " and the secret number was: " + random);


		} while (numGames < 3);

		if (numUserWin > numCompWin) {
			JOptionPane.showMessageDialog(null, "Congratulations. The user won this time and have a total of " + numUserWin + " wins");
		}
		else {
			JOptionPane.showMessageDialog(null, "Congratulations. The computer won this time and have a total of " + numCompWin + " wins");
		}





	}
}