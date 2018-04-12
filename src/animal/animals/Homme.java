package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Omnivore;

public class Homme extends Animal {

	Deplacer deplacer;
	
	public Homme (int age, float poids, float taille, String nom) {
		this.age = 25;
		this.poids = 75.0f;
		this.taille = 180.0f;
		this.nom = "Homme";
		this.regime = new Omnivore();
		
	}
	public void HommeDeplacer() {
		this.deplacer = Deplacer.MARCHER;
	}
}
