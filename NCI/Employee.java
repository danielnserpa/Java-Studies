package NCI;
/*
* author Daniel
*10 oct 2023
* Employee.java
*/

public class Employee{


		// Variables

		private String name;
		private int age;

		// Declare constructors

		public Employee() {

		}

		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// Getters and setters

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String toString() {
			return "Employee {name: " + name + ", age " + age + "}";



}



	}