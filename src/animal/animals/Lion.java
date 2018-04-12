package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Lion extends Animal {
	
	Deplacer deplacer;
	
	public Lion(int age, float poids, float taille, String nom) {
		this.age= 7;
		this.poids=50.0f;
		this.taille=200.0f;
		this.nom="Lion";
		this.regime= new Carnivore();
	}
	
	public void LionDeplacer() {
		this.deplacer = Deplacer.COURIR;
	}
	

}
