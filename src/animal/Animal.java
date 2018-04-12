package animal;

import animal.regime.Regime;

public abstract class Animal {

	private Deplacer deplacer;
	protected int age;
	protected float poids;
	protected float taille;
	protected String nom;
	protected Regime regime;	
	
	public Animal() {
		this.age=0;
		this.poids=0;
		this.taille=0;
		this.nom="";
		
	
	}
	
	public Deplacer getDeplacer() {
		return this.deplacer;
		
	}
	
	public Regime getRegime() {
		return this.regime;
	}
}
