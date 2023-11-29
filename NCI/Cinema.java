package NCI;
/*
* Cinema.java
* @author Enda
* 8/3/2022
*/

public class Cinema{

	// Declare variables

	private int age;
	private int cost;


	// Constructor

	public Cinema(){
		//age = 0;
		//cost = 0;
	}

	// Compute

	public void compute(){
		if(age < 5){
			cost = 0;
		}
		else if(age >= 5 && age <= 14){
			cost = 5;
		}
		else if (age >= 15 && age <= 65){
			cost = 10;
		}
		else {cost = 0;}
	}

	// Getters and Setters

	public void setAge(int age){
		this.age = age;
	}

	public void setCost(int cost){
		this.cost = cost;
	}

	public int getcost(){
		return cost;
	}

	public int getAge(){
		return age;
	}



}