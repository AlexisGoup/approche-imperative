package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		System.out.println("Bienvenue !");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre :");
		int nb = scanner.nextInt();
		int sum = nb;
		
		for (int i = 0; i < nb; i++) {
			sum += i;
		}
		
		System.out.println("La somme de tous les entiers entre 1 et " + nb + " donne : " + sum);
		
		System.out.println("Au revoir !");

	}

}
