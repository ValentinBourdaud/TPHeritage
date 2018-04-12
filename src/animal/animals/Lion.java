package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Lion extends Animal {
	
	private Deplacer deplacer;
	
	public Lion(int age, float poids, float taille) {
		this.nom="Lion";
		this.regime= new Carnivore();
	}
	
	public void LionDeplacer() {
		this.deplacer = Deplacer.COURIR;
		System.out.println("Je cours dans la savane");
	}
	
}


