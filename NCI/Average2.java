package NCI;
/*
* author Daniel
* 27 oct 2023
* Average.java
*/

public class Average2 {

		// Variables

		private int nums [] = new int [5];
		private double average, sum = 0.0;
		private int min, max;

		// Constructor

		public Average2(){

		}

		// Compute

		public void compute (){

			for (int i = 0; i < nums.length; i++){
				sum += nums[i]; // sum = sum + nums[i]

		}

		average = sum / nums.length;

	}

		public void computeMin (){

			min = nums[0];

			for (int i = 1; i < nums.length; i++){

				if (nums[i] < min){
							min = nums[i];
						}
					}
				}

		public void computeMax (){

			max = nums[0];

			for(int i = 1; i < nums.length; i++){

				if (nums[i] > max){
							max=nums[i];
					}
				}
			}


	// Getters and setters

	public int getmin(){
		return min;
	}
	public int getmax(){
			return max;
	}

	public void setnums(int nums[]){
		this.nums=nums;
	}

	public double getaverage(){
		return average;
	}

}

