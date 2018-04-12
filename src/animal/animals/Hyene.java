package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Carnivore;

public class Hyene extends Animal {
	
	//Declaration de l'attribut deplacer

	private Deplacer deplacer;
	
	//Constructeur de Hyene
	
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

