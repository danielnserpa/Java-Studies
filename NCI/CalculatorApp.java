package NCI;
/*
* author Daniel
* 07 oct 2023
* CalculatorApp.java
*/

import java.util.Scanner;

public class CalculatorApp{

public static void main(String args[]){

// Variables

	int Num1, Num2;
	int Sum, Diff;

// Objects

Scanner sc = new Scanner(System.in);
Calculator myC = new Calculator();

// Input

System.out.println("Choose your first number: ");
Num1 = sc.nextInt();

System.out.println("Choose your second number: ");
Num2 = sc.nextInt();

myC.setNum1(Num1);
myC.setNum2(Num2);

// Compute

myC.compute();

// Output


Sum = myC.getSum();
Diff = myC.getDiff();

System.out.println("Your sum is " + Sum + " and your difference is " + Diff);

	}


}