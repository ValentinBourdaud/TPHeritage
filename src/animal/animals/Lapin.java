package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Herbivore;

public class Lapin extends Animal {
	
	//Declaration de l'attribut deplacer

	private Deplacer deplacer;

	//Constructeur de lapin
	
	public Lapin(int age, float poids, float taille) {
		this.age=age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "Lapin";
		this.regime = new Herbivore();
	}

	public void LapinDeplacer() {
		this.deplacer = Deplacer.SAUTER;
		System.out.println("Je saute pour aller de terriers en terriers");
	}

}
