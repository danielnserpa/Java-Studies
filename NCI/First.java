package NCI;
/*
* author Daniel
*10 oct 2023
* First.java
*/

	public class First{

		// Variables

		private String name, message;

		// Constructors

		public First(){

		}

		public First(String name, String message){
			this.name = name;
			this.message = message;
		}

		// Compute method

		public void compute(){
			message = "Hello " + name;
		}

		// Getters and setters

		public void setName(String name){
			this.name = name;

		}


		public void setMessage(String message){
			this.message = message;
		}

		public String getName(){
			return name;
		}

		public String getMessage(){
			return message;
		}

	}