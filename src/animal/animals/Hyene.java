package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Hyene extends Animal {

	Deplacer deplacer;
	
	public Hyene (int age, float poids, float taille, String nom) {
		this.age = 10;
		this.poids = 30.0f;
		this.taille =100.0f;
		this.nom= "Hyene";
		this.regime = new Carnivore();
	}
		
		
		public void HyeneDeplacer() {
			this.deplacer = Deplacer.COURIR ;
			}
		
		
		
		
	}

