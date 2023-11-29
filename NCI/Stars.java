package NCI;
/*
* author Daniel
* 17 nov 2023
* Stars.java
*/

import java.util.Scanner;

public class Stars {
  public static void main (String args[]){

    // Variables

    String word;

    // Objects

    Scanner sc = new Scanner(System.in);

    // Input

    System.out.println("Please enter a word: ");
    word = sc.next();

    // Process and output

    for (int i=0; i < word.length(); i++){
System.out.print("*");

    }


  }

}
