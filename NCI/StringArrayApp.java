package NCI;
/*
* Author Daniel
* 10/11/2023
* StringArrayApp.java
*/

import java.util.Scanner;


public class StringArrayApp{

	public static void main(String args []){

		// Variables

		String Words []; //output var
		String Sentence; // input var

		// Objects

		Scanner sc = new Scanner(System.in);
		StringArray myS = new StringArray();


		// Input

		System.out.println ("Please enter a sentence: ");


		Sentence = sc.nextLine();

		// Process

		myS.setSentence(Sentence);

		myS.compute();

		Words = myS.getWords();

		// Output

		System.out.println ("The sentence " + Sentence +
										" split into words: " );
										for (int i = 0; i < Words.length; i++){
											System.out.println (Words[i]);
										}


	}


}