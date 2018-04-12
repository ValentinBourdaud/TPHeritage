package animal.regime;

public abstract class Regime {
	private String regime;
	
	//Constructeur de Regime

	public Regime(String regime) {
		this.regime= regime;	
		}


	public String toString() {
		return this.regime;
	}


	
}
