package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3 )
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("*******************************");
		
		for (int i = 0; i < array.length; i++) {
			int modulo = array[i] % 2;
			
			if (modulo == 0) {
				System.out.print(array[i] + " ");
			}
			
		}
		
		System.out.println();
		System.out.println("*******************************");
		
		for (int i = 0; i < array.length; i++) {
			int modulo = i % 2;
			
			if (modulo == 0) {
				System.out.print(array[i] + " ");
			}
			
		}
		
		System.out.println();
		System.out.println("*******************************");
		
		for (int i = 0; i < array.length; i++) {
			int modulo = i % 2;
			
			if (modulo != 0) {
				System.out.print(array[i] + " ");
			}
			
		}

	}

}
