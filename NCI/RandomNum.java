package NCI;
/*
* author Daniel
* 27 oct 2023
* RandomNum.java
*/

public class RandomNum{



// Variables

private int random;
private int guess;
private String message;


// Constructor

public RandomNum(){

}

// Compute

public void compute(){

random = (int) (Math.random() * 10) + 1;

	if (guess > random){
			message = ("The number you chose is higher than the secret number");
		}
		else if (guess < random){
			message =  ("The number you chose is lower than the secret number");
		}
		else{
			message = ("Congratulations, you chose the secret number");
		}

}

// Setters and getters

public void setguess (int guess){
	this.guess = guess;

}

public int getrandom(){
	return random;

}

public String getmessage(){
		return message;

	}




}