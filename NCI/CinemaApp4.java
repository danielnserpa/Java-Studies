package NCI;
/*
* CinemaApp4.java
* @author Enda
* 21/2/23
*/
import javax.swing.JOptionPane;

public class CinemaApp4 {
	public static void main (String args[]){

		// Declare variables
		int age;
		int cost;
		int numTickets = 0;
		String moreTickets;
		int totalCost = 0;

		// Declare and create objects

		Cinema myC = new Cinema();

		// Input

		do {
				age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age of the person "));

		// Process

		myC.setAge(age);
		myC.compute();

		// Output

		cost = myC.getcost();


		JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: E" + cost);

		moreTickets = JOptionPane.showInputDialog(null, "Would you like more tickets? Yes or No?");
		numTickets++;

			totalCost = totalCost + cost;

		}

		while(moreTickets.equalsIgnoreCase("yes") && numTickets < 4);

		JOptionPane.showMessageDialog(null, "Total Cost is: " + totalCost);

	} // main
} // class
