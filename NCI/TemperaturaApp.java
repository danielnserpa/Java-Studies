package NCI;
/*
* author Daniel
*21 oct 2023
* DogsApp.java
*/

import java.util.Scanner;

public class TemperaturaApp {

	public static void main(String args[]) {

// Variables

int C;
double
F;

// Objects

Scanner sc = new Scanner(System.in);
Temperatura myT = new Temperatura();

// Input

System.out.println("How many degrees celsius? ");
C = sc.nextInt();

myT.setC(C);

// Compute

myT.compute();

// Output

F = myT.getF();

System.out.println("Your temperature in celsius " + C + " when converted to fahrenheit is " + F);










	}


}