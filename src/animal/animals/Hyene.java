package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Hyene extends Animal {

	Deplacer deplacer;
	
	public Hyene (int age, float poids, float taille) {
		this.age=age;
		this.poids = poids;
		this.taille = taille;
		this.nom= "Hyene";
		this.regime = new Carnivore();
	}
		
		
		public void hyeneDeplacer() {
			this.deplacer = Deplacer.COURIR ;
			System.out.println("Je cours dans la savane");
			}
		
		
		
		
	}

