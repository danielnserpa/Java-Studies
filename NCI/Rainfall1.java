package NCI;
/*
* author Daniel
* 03 nov 2023
* Rainfall1.java
*/

public class Rainfall1 {

	public static void main (String args[]){

	// Variables

	int rainfall[][] = {{2, 4, 3, 2, 1, 1, 4}, {5, 3, 1, 2, 1, 3, 4}, {3, 3, 2, 3, 1, 1, 2}, {2, 1, 3, 3, 2, 1, 1}};

	for (int i = 0; i < 4; i++){
		for (int j = 0; j < 7; j++){
			System.out.print(rainfall[i][j]);

		}
		System.out.println();
	}


}

}