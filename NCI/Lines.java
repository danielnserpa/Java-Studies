package NCI;
/*
* author Daniel
* 10 oct 2023
* Lines.java
*/

import java.util.Scanner;

public class Lines  {

public static void main (String args[]){

// Variables

String word;


// Objects

Scanner sc = new Scanner(System.in);

// Input

System.out.println("Please enter a word: ");
word = sc.next();

int size = word.length();

System.out.println ("The number os letters in " + word + " is: " + size);

System.out.println("When printing each letter of " + word + " you'd get: ");

for (int i = 0; i < size; i++){
System.out.println(word.charAt(i));

// If you wanna print it in reverse use this:
//for (int i = size - 1; i >= 0; i--){
//	System.out.println(word.charAt(i));
}









// Process

// Output

}


}