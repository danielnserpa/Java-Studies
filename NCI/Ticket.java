package NCI;
import javax.swing.JOptionPane;
public class Ticket {
	public static void main (String args[]){

	// variables

	int age;

	// object

	// input

	age = Integer.parseInt(JOptionPane.showInputDialog(null, "What's your age?"));

	if ((age > 5) && (age < 15)){
		JOptionPane.showMessageDialog(null, "Free ticket");
	}
		else if ((age > 15) && (age < 65)){
			JOptionPane.showMessageDialog(null, "Too expensive for you to get a ticket, bruv");
	}
	else {
		JOptionPane.showMessageDialog(null, "Please go home, you're either a baby or dead");
	}



}

}