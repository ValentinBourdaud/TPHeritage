package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Omnivore;

public class Homme extends Animal {

	private Deplacer deplacer;
	
	public Homme (int age, float poids, float taille) {
		
		this.age=age;
		this.poids = poids;
		this.taille = taille;
		this.nom = "Homme";
		this.regime = new Omnivore();
		
	}
	public void hommeDeplacer() {
		this.deplacer = Deplacer.MARCHER;
		System.out.println("Je marche, mais il m'arrive de courrir");
	}
}
