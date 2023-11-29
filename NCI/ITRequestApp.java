package NCI;
/*
* author Daniel
* 14 nov 2023
* ITRequestApp.java
*/

import javax.swing.JOptionPane;

public class ITRequestApp {

	public static void main(String args[]) {

		// Variables

		int choice = 0;
		int priority[];
		int numRequests = 0;
		int i;
		int maxPriority = 4;
		int minPriority = 0;
		int detailsMinPriority = 0;
		int detailsMaxPriority = 0;
		double average = 0.0;
		String name[];
		String id[];
		String description[];
		String moreRequests;
		String priorityInput;
		boolean addMoreRequests;

		// Objects

		ITRequest myIT = new ITRequest(); // Creating a new object

		// Input

		name = new String[3];
		id = new String[3];
		description = new String[3]; // Creating an array with 3 slots for each variable
		priority = new int[3];

		do { // I put everything inside a do/while loop to ensure that the process will keep
					// happening until a certain requirement is reached.
			try { // Used a try/catch to make sure the user must input a number from 1-6
				addMoreRequests = true; // This variable was used to make the application avoid more than 3 inputs from
																// the
																// user.

				choice = Integer.parseInt(JOptionPane.showInputDialog(null,
						"----------------------------------------------------------------------------------------------------------------"
								+
								"\n" +
								"\n					WELCOME TO 777 IT SUPPORT REQUEST. HOW CAN WE HELP YOU?" +
								"\n" +
								"\n1 - Enter the details of a new request" +
								"\n2 - Display the details of the last entered request" +
								"\n3 - Display the highest priority IT request" +
								"\n4 - Display the lowest priority IT request" +
								"\n5 - Display the average priority value of all IT requests" +
								"\n6 - Exit application" +
								"\n" +
								"\n----------------------------------------------------------------------------------------------------------------"));
				myIT.setchoice(choice);

				if (choice == 1) {

					if (numRequests < 3) { // A loop created to keep working until the user inputs the 3rd request.

						do {
							for (i = 0; i < numRequests; i++)

								if (numRequests == 3) {
									JOptionPane.showMessageDialog(null, "You have reached the maximum number of requests.");
									addMoreRequests = false;
									break;
								}

							do {
								name[i] = JOptionPane.showInputDialog(null, "Please enter your name: ");

								myIT.setname(name);

								// These lines were first used to try to send the user back to the main menu if
								// the CANCEL button was pressed. Didn't work so I decided to comment everything
								// and left it here to work on it in the future. Same happens for the other
								// variables.

								// if (name[i] == null) {
								// JOptionPane.showMessageDialog(null, "The request was canceled.");
								// addMoreRequests = false;
								// break;
								// }

								if (!name[i].matches("[a-zA-Z]{3,}")) { // This method was used to make sure the variable name only
																												// receives letters and has a length of at least 3 characters.
									JOptionPane.showMessageDialog(null, "Invalid name.");
								}

							} while (!name[i].matches("[a-zA-Z]{3,}")); // The loop goes on until the input name matches the criteria.

							do {
								id[i] = JOptionPane.showInputDialog(null,
										"Please enter the request ID (6 letters w/o space): ");

								myIT.setid(id);

								// if (id[i] == null) {
								// JOptionPane.showMessageDialog(null, "The request was canceled.");
								// addMoreRequests = false;
								// break;
								// }

								if (!id[i].matches("[a-zA-Z]{6}")) { // This method was used to make sure the variable id only receives
																											// an exact value of 6 letters.
									JOptionPane.showMessageDialog(null, "Your ID must have 6 letters.");
								}

							} while (!id[i].matches("[a-zA-Z]{6}")); // The loop goes on until the input id matches the criteria.

							do {
								description[i] = JOptionPane.showInputDialog(null, "Enter your request description: ");

								myIT.setdescription(description);

								// if (description[i] == null) {
								// JOptionPane.showMessageDialog(null, "The request was canceled.");
								// addMoreRequests = false;
								// break;
								// }

								if (description[i].length() < 6 || !description[i].matches("[a-zA-Z ]+") // This method makes sure the
																																													// description has letters and
																																													// space, and at least 6
																																													// characters of length. Only
																																													// space is not allowed.
										|| description[i].trim().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Please enter a valid description.");
								}

							} while (description[i].length() < 6 || !description[i].matches("[a-zA-Z ]+") // The loop goes on until
																																														// the input description
																																														// matches the criteria.
									|| description[i].trim().isEmpty());

							do {
								try { // Same scenario as the first try/catch. Only numbers are allowed.
									priorityInput = JOptionPane.showInputDialog(null,
											"Enter your request priority (1 being highest and 3 being lowest): ");

									// if (priorityInput == null) {
									// JOptionPane.showMessageDialog(null, "The request was canceled.");
									// addMoreRequests = false;
									// break;
									// }

									priority[i] = Integer.parseInt(priorityInput);
									myIT.setpriority(priority);

									if (priority[i] < 1 || priority[i] > 3) {
										JOptionPane.showMessageDialog(null, "Priority must be between 1 and 3.");
									}

								} catch (NumberFormatException e) {
									JOptionPane.showMessageDialog(null, "Priority must be between 1 and 3.");
								}

							} while (priority[i] < 1 || priority[i] > 3); // The loop goes on until the criteria is met.

							numRequests++;
							myIT.setnumRequests(numRequests);

							JOptionPane.showMessageDialog(null, "The details of your request are: " +
									"\n" +
									"\nName: " + name[i] +
									"\nRequest ID: " + id[i] + // It shows the details of the request made and each variable is stored
																							// according to its array's index.
									"\nRequest description: " + description[i] +
									"\nRequest priority: " + priority[i]);

							do { // This do/while gives the user the option to input another request until the
										// answer is no or the answer is yes but he/she has already input 3 requests.
								moreRequests = JOptionPane.showInputDialog(null, "Would you like to add another request? Yes or No");

							} while (!moreRequests.equalsIgnoreCase("yes") && !moreRequests.equalsIgnoreCase("no"));

							if (addMoreRequests && numRequests == 3 && moreRequests.equalsIgnoreCase("yes")) {
								JOptionPane.showMessageDialog(null, "You have reached the maximum number of requests.");
							}

						} while (addMoreRequests && numRequests < 3 && moreRequests.equalsIgnoreCase("yes")); // The loop goes on
																																																	// until the criteria
																																																	// is met.

					} else if (choice == 1 && !addMoreRequests) { // If the user chooses 1 but the variable addMoreRequests is
																												// false, a message is shown telling the user he/she can't input
																												// more requests.
						JOptionPane.showMessageDialog(null, "You cannot add more requests at the moment");
					} else {
						JOptionPane.showMessageDialog(null, "You have reached the maximum number of requests.");

					}
				} else if (choice == 2) {

					if (numRequests > 0) {

						name = myIT.getname();
						id = myIT.getid();
						description = myIT.getdescription(); // Uses the compute method to get the values of each variable in its
																									// respective array.
						priority = myIT.getpriority();

						int lastRequest = numRequests - 1; // This is used to make sure that only the last input request is shown
																								// when the user chooses number 2 on the menu. It's set as numRequests
																								// -1 because arrays are set starting as number 0.
						JOptionPane.showMessageDialog(null, "The details of the last entered request are: " +
								"\n" +
								"\nName: " + name[lastRequest] +
								"\nRequest ID: " + id[lastRequest] +
								"\nRequest description: " + description[lastRequest] +
								"\nRequest priority: " + priority[lastRequest]);

					} else { // If no requests have been entered, the message below is shown.
						JOptionPane.showMessageDialog(null, "No requests have been entered yet.");
					}
				} else if (choice == 3) {

					for (int j = 0; j < numRequests; j++) { // The loop will go through the number of requests then it will go
																									// through the if statement and check if the value assigned on
																									// priority is lower than the current value of maxPriority OR if the
																									// value is the same and
																									// the index assigned on j is lower than the index assigned on
																									// detailsMaxPriority. It will then assign
																									// maxPriority and detailsMaxPriority according to the conditions
																									// detailed.
						if (priority[j] < maxPriority || (priority[j] == maxPriority && j < detailsMaxPriority)) {
							maxPriority = priority[j];
							detailsMaxPriority = j;
						}
					}

					myIT.setmaxPriority(maxPriority);

					if (maxPriority != 0 && maxPriority != 4) { // If there's a request, the message below will be shown.
						JOptionPane.showMessageDialog(null,
								"The highest priority request is: " +
										"\n" + description[detailsMaxPriority]);
					} else {
						JOptionPane.showMessageDialog(null, "No priorities have been entered yet.");
					}

				} else if (choice == 4) {

					for (int j = 0; j < numRequests; j++) { // Same idea as choice == 3. The loop will go through the number of
																									// requests then it will go
																									// through the if statement and check if the value assigned on
																									// priority is higher than the current value of minPriority OR if the
																									// value is the same and
																									// the index assigned on j is lower than the index assigned on
																									// detailsMinPriority. It will then assign
																									// minPriority and detailsMinPriority according to the conditions
																									// detailed.
						if (priority[j] > minPriority || (priority[j] == minPriority && j < detailsMinPriority)) {
							minPriority = priority[j];
							detailsMinPriority = j;
						}
					}

					myIT.setminPriority(minPriority);

					if (minPriority == 1 || minPriority == 2 || minPriority == 3) { // If there's any request, the message below
																																					// will be shown.
						JOptionPane.showMessageDialog(null, "The lowest priority request is: " +
						"\n" + description[detailsMinPriority]);
					} else {
						JOptionPane.showMessageDialog(null, "No priorities have been entered yet.");
					}

				} else if (choice == 5) {

					if (numRequests > 0) { // If there's any request made, the compute method will calculate average using
																	// the Instatiable class and then print the average value.

						myIT.compute();
						average = myIT.getaverage();

						JOptionPane.showMessageDialog(null, "The average priority of all requests is: " + average);
					} else {
						JOptionPane.showMessageDialog(null, "No priorities have been entered yet.");
					}

				} else if (choice == 6) { // Number 6 is used to exit the application and that's the only way to close it
																	// because the do/while used on the beginning of the code.
					JOptionPane.showMessageDialog(null, "Thanks for contacting us");

				} else { // If the user input any number other than 1-6 the message below will be shown.
					JOptionPane.showMessageDialog(null, "Please insert: "
							+ "\n"
							+ "\n1-5 to continue"
							+ "\n6 to exit");
				}

			} catch (NumberFormatException e) { // Used to make sure the user inputs only numbers.
				JOptionPane.showMessageDialog(null, "Please insert: "
						+ "\n"
						+ "\n1-5 to continue"
						+ "\n6 to exit");
			}

		} while (choice != 6); // Ends the application.

	}

}