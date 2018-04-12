package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Lion extends Animal {
	
	//Declaration de l'attribut deplacer
	
	private Deplacer deplacer;
	
	//Constructeur de lion
	
	public Lion(int age, float poids, float taille) {
		
		this.age=age;
		this.poids = poids;
		this.taille = taille;
		this.nom="Lion";
		this.regime= new Carnivore();
	}
	
	public void lionDeplacer() {
		this.deplacer = Deplacer.COURIR;
		System.out.println("Je cours dans la savane");
	}
	
}


