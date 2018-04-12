package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Omnivore;

public class Homme extends Animal {

	private Deplacer deplacer;
	
	public Homme (int age, float poids, float taille) {
		this.nom = "Homme";
		this.regime = new Omnivore();
		
	}
	public void HommeDeplacer() {
		this.deplacer = Deplacer.MARCHER;
		System.out.println("Je marche, mais il m'arrive de courrir");
	}
}
