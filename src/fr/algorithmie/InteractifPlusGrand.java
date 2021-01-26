package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int maxValue = 0;
		
		System.out.println("Bienvenue !");
		System.out.println("Veuillez saisir dix chiffres entiers positifs :");
		
		for (int i = 0; i < 10; i++) {
			int nb = scanner.nextInt();
			if (nb > maxValue) maxValue = nb;
		}
		
		System.out.println("Le plus grand chiffre saisi est : " + maxValue);

	}

}
