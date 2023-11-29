package NCI;
/*
* author Daniel
* 14 nov 2023
* ITRequest.java
*/

public class ITRequest {

	// Variables

	private int choice = 0;
	private int priority[];
	private int numRequests = 0;
	private int maxPriority = 4;
	private int minPriority = 0;
	private int sumPriority;
	private double average = 0.0;
	private String name[];
	private String id[];
	private String description[];

	// Constructor

	public ITRequest() { // Create a constructor that allows the creation of new objects.

	}

	// Compute

	public void compute() {

		sumPriority = 0;

		for (int i = 0; i < numRequests; i++) { // The loop goes through numRequests and add each priority value input by
																						// the user on sumPriority.
			sumPriority += priority[i];

		}
		average = (double) sumPriority / numRequests; // Then average takes the value of sumPriority and divide by
																									// numRequests to get the average result of every priority value.

	}

	// Output // Setters and getters

	public void setchoice(int choice) {
		this.choice = choice;
	}

	public int getchoice() {
		return choice;
	}

	public void setaverage(double average) {
		this.average = average;
	}

	public double getaverage() {
		return average;
	}

	public void setpriority(int[] priority) {
		this.priority = priority;
	}

	public int[] getpriority() {
		return priority;
	}

	public void setname(String[] name) {
		this.name = name;
	}

	public String[] getname() {
		return name;
	}

	public void setid(String[] id) {
		this.id = id;
	}

	public String[] getid() {
		return id;
	}

	public void setdescription(String[] description) {
		this.description = description;
	}

	public String[] getdescription() {
		return description;
	}

	public void setnumRequests(int numRequests) {
		this.numRequests = numRequests;
	}

	public int getnumRequests() {
		return numRequests;
	}

	public void setmaxPriority(int maxPriority) {
		this.maxPriority = maxPriority;
	}

	public int getmaxPriority() {
		return maxPriority;
	}

	public void setminPriority(int minPriority) {
		this.minPriority = minPriority;
	}

	public int getminPriority() {
		return minPriority;
	}

}
