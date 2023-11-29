package NCI;
/*
* author Daniel
* 27 oct 2023
* Guess3.java
*/

public class Guess3 {

	// Variables

	private int random;
	private int userGuess;
	private int numGames = 0, numUserWin = 0, numCompWin = 0;
	private String message;


	// Constructor

	public Guess3(){
		random = (int) (Math.random() * 10) + 1;
		System.out.println(random);
	}

	// Compute

	public void compute(){



		if (userGuess > random){
			message = ("The number you chose is higher than the secret number");
			numCompWin ++;
		}
		else if (userGuess < random){
			message =  ("The number you chose is lower than the secret number");
			numCompWin ++;
		}
		else{
			message = ("Congratulations, you chose the secret number");
			numUserWin ++;
		}

	}


	// Setters and getter

	public void setuserGuess(int userGuess){
	this.userGuess = userGuess;
	}

	public void setnumGames(int numGames){
		this.numGames = numGames;
	}

	public int getrandom(){
		return random;
	}

	public String getmessage(){
		return message;
	}

	public int getnumUserWin(){
		return numUserWin;
	}

		public int getnumCompWin(){
			return numCompWin;
	}

}