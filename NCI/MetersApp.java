package NCI;
/*
* author Daniel
* 22 oct 2023
* MetersApp.java
*/

import java.util.Scanner;

public class MetersApp {

	public static void main (String args[]){

// Variables

int Cm;
int Mt;

// Object

Scanner sc = new Scanner(System.in);
Meters myM = new Meters();

// Input

System.out.println("How many meters do you want to convert to centimeters? ");
Mt = sc.nextInt();

myM.setMt(Mt);


// Compute

myM.compute();

Cm = Mt * 100;

// Output

Cm = myM.getCm();

System.out.println("When converting " + Mt + " meters, you get " + Cm + " centimeters");








}
}