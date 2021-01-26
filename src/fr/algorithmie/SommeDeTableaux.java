package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] first_array  = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] second_array = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int[] sum_array    = new int[first_array.length];
		
		for (int i = 0; i < first_array.length; i++) {
			sum_array[i] = first_array[i] + second_array[i];
			System.out.print(sum_array[i] + " ");
		}

	}

}
