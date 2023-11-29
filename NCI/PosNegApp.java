package NCI;
/*
* author Daniel
* 29 oct 2023
* PosNegApp.java
*/

import javax.swing.JOptionPane;

public class PosNegApp{

	public static void main (String args[]){

// Variables

	int num;
	String message;

// Object

	PosNeg myPN = new PosNeg();

// Input

num = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number: "));
myPN.setnum (num);

// Process

myPN.compute();

// Output

message = myPN.getmessage();

JOptionPane.showMessageDialog(null, message);




	}

}