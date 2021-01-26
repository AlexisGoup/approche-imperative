package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		boolean isCorrect = false;
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Veuillez saisir un nombre entre 1 et 10 :");		
			int nb = scanner.nextInt();
			
			if (nb >= 0 && nb <= 10) {
				System.out.println("Bravo vous avez saisi un nombre correct !");
				isCorrect = true;
			} else {
				System.out.println("Votre entrée est incorrecte");
				System.out.println("****************************************************");
				System.out.println();
			}
		} while (isCorrect == false);
		
		

	}

}
