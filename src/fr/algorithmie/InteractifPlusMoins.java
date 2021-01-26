package fr.algorithmie;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		int count   = 0;
		int random  = ThreadLocalRandom.current().nextInt(0, 101);
		
		System.out.println("Un nombre aléatoire a été généré !");
		System.out.println("Combien de temps allez vous mettre pour le trouver...");
		System.out.println("Nous allons voir cela !");
		System.out.println("***Hint for dev : The number is " + random + "***");
		
		Scanner scanner = new Scanner(System.in);
		int nbSaisi;
		
		do {
			System.out.println();
			System.out.println("Saisissez un nombre :");			
			nbSaisi = scanner.nextInt();
			if(nbSaisi != random) System.out.println("Ce n'est pas le bon nombre ! Essayez encore :)");			
			count++;
		} while (nbSaisi != random);
		
		System.out.println("Félicitations !");
		System.out.println("Vous avez mis " + count + " essais pour trouver le nombre mystère.");

	}

}
