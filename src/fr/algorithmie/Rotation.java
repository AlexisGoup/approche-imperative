package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 7};
		int lastValue = array[array.length - 1];
		
		for (int i = array.length - 1; i >= 0; i--) {

			if (i != 0) array[i] = array[i - 1];
			if (i == 0) array[i] = lastValue;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		} 

	}

}
