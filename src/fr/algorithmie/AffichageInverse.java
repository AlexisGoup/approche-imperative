package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("*****************************************");
		
		for (int i = array.length; i > 0; i--) {
			int index = i - 1;
			System.out.print(array[index] + " ");
		}
		
		System.out.println();
		System.out.println("*****************************************");
		
		int[] arrayCopy = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
			System.out.print(arrayCopy[i] + " ");
		}
			
		
	}

}
