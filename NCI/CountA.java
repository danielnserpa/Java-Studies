package NCI;
/*
* author Daniel
* 10 oct 2023
* CountA.java
*/

public class CountA {

	// Variables

	private String word;
	private int numA;

	// Constructor

	public CountA(){

		word = " ";
		numA = 0;

	}

 // Compute

 public void compute (){
	 // You could use word.toLowerCase();
	 for (int i = 0; i < word.length(); i++){
		 if (word.charAt(i) == 'a' || word.charAt(i) == 'A'){
			 numA++;

		 }
	 }

 }

 // Setters and getters

 public void setword(String word){
	 this.word = word;
 }

 public int getnumA(){
	 return numA;
 }

}