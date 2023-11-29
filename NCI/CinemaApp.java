package NCI;
/*
* CinemaApp.java
* @author Enda
* 21/2/23
*/
import javax.swing.JOptionPane;

public class CinemaApp {
	public static void main (String args[]){

		// Declare variables
		int age;
		int cost;
		int numTickets;
		int totalCost = 0;

		// Declare and create objects

		Cinema myC = new Cinema();

		// Input

		numTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tickets"));


		for(int i = 0; i < numTickets; i++) {
				age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age of person " + (i+1)));

		// Process

		myC.setAge(age);
		myC.compute();

		// Output

		cost = myC.getcost();

		totalCost = totalCost + cost;

		} // for

		JOptionPane.showMessageDialog(null, "The total cost is " + totalCost);

	} // main
} // class
