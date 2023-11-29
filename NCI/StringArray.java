package NCI;
/*
* Author Daniel
* 10/11/2023
* StringArray.java
*/

public class StringArray{


	// Variables

	private String Words []; //output var
	private String Sentence; // input var


	// Constructor

	public StringArray(){



	}

	// Compute

	public void compute(){

		Words = Sentence.split(" ");

	}


	// Setters and Getters

	public void setSentence(String Sentence){
	this.Sentence = Sentence;
}

	public String [] getWords(){
	return Words;
}
}