package NCI;
/*
*
*
*
*/

import java.util.Scanner;

public class Grades {

	public static void main (String args[]){


// Variables

int grade;

Scanner sc = new Scanner(System.in);

System.out.println("What's your grade?");
grade = sc.nextInt();

if (grade >= 90 && grade <=100) {
	System.out.println ("Grade A");
}
else if (grade >=70 && grade < 90){
	System.out.println ("Grade B");
}
else if (grade >=60 && grade < 70){
System.out.println ("Grade C");
}
else if (grade >= 0 && grade < 50){
	System.out.println ("Grade D for dumb");
}
else {
	System.out.println ("Invalid");
}



	}


	}