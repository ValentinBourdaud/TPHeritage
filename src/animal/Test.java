package animal;

import java.util.Scanner;

import animal.animals.Homme;
import animal.animals.Hyene;
import animal.animals.Lapin;
import animal.animals.Lion;

public class Test {

	public static void main(String[] args) {

		System.out.println("Sur quel animal voulez-vous avoir des informations ?");
		System.out.println("Tapez 1 pour le lion");
		System.out.println("Tapez 2 pour le lapin");
		System.out.println("Tapez 3 pour la hyene");
		System.out.println("Tapez 4 pour l'homme");

		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();

		switch (str) {
		case 1:
			Animal lion = new Lion(10, 250.0f, 250.0f);
			System.out.println("Le " + lion.nom + " a " + lion.age + "ans. Il pèse " + lion.poids + " kilos et il mesure environ " + lion.taille + " cm." );
			break;

		case 2:

			Animal lapin = new Lapin(2, 7.0f, 30.0f);
			System.out.println("Le " + lapin.nom + " a " + lapin.age + "ans. Il pèse " + lapin.poids + " kilos et il mesure environ " + lapin.taille + " cm." );
			break;

		case 3:
			Animal hyene = new Hyene(5, 120.0f, 200.0f);
			System.out.println("La " + hyene.nom + " a " + hyene.age + "ans. Il pèse " + hyene.poids + " kilos et il mesure environ " + hyene.taille + " cm." );
			break;

		case 4:
			Animal homme = new Homme(25, 75.0f, 180.0f);
			System.out.println("L' " + homme.nom + " a " + homme.age + "ans. Il pèse " + homme.poids + " kilos et il mesure environ " + homme.taille + " cm." );
			break;

		}

	
		

		
		
	}

}
