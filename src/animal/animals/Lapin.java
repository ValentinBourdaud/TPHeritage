package animal.animals;

import animal.Animal;
import animal.Deplacer;
import animal.regime.Herbivore;

public class Lapin extends Animal {

	Deplacer deplacer;
	
	public Lapin() {
		this.age = 3;
		this.poids =10.5f;
		this.taille =30.0f;
		this.nom= "Lapin";
		this.regime = new Herbivore();
	}
	
	public void LapinDeplacer() {
		this.deplacer = Deplacer.SAUTER;
	}
	
}
