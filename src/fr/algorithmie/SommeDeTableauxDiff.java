package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] first_array  = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] second_array = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
		int[] sum_array    = new int[first_array.length];
		
		for (int i = 0; i < first_array.length; i++) {
			if(i > (second_array.length - 1)) {
				sum_array[i] = first_array[i];
			} else {
				sum_array[i] = first_array[i] + second_array[i];
			}
			
			System.out.print(sum_array[i] + " ");
		}

	}

}
