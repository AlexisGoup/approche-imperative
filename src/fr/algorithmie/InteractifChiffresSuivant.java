package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivant {
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenue !");
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre :");
		int nb = scanner.nextInt();
		
		for (int i = 0; i < 10; i++) {
			nb++;
			System.out.println(nb);
		}
		
		System.out.println("Au revoir !");
		
	}
}
