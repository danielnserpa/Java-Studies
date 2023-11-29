package NCI;
/*
* author Daniel
*10 oct 2023
* EmployeeApp.java
*/

public class EmployeeApp{

	public static void main (String args []){

		// Variables

		// Objects

		//Employee enda = new Employee();
		//enda.setName("enda");
		//enda.setAge(34);

		Employee enda = new Employee("Enda", 33);
		Employee johnny = new Employee("Johnny", 43);

		Employee emps [] = new Employee[5];
		emps[0] = enda;
		emps[1] = johnny;
		emps[2] = new Employee("Daniel", 30);

		for(int i=0; i < emps.length; i++){
			System.out.println ("Employee " + (i + 1) + emps[i].toString());
		}



		// Input



		// Process

		// Output

		System.out.println("Employee enda... " + enda.toString());
		System.out.println("Employee johnny... " + johnny.toString());


		}
	}