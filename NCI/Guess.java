package NCI;
/*
* author Daniel
* 27 oct 2023
* Guess.java
*/

public class Guess {

	// Variables

	private int random;
	private int userGuess;
	private String message;
	private boolean userWin = false;

	// Constructor

	public Guess(){
		random = (int) (Math.random() * 10) + 1;
		System.out.println(random);
	}

	// Compute

	public void compute(){



		if (userGuess > random){
			message = ("The number you chose is higher than the secret number");
		}
		else if (userGuess < random){
			message =  ("The number you chose is lower than the secret number");
		}
		else{
			message = ("Congratulations, you chose the secret number");
			userWin = true;
		}

	}


	// Setters and getter

	public void setuserGuess(int userGuess){
	this.userGuess = userGuess;
	}

	public int getrandom(){
		return random;
	}

	public String getmessage(){
		return message;
	}

	public boolean getuserWin(){
		return userWin;
	}

}