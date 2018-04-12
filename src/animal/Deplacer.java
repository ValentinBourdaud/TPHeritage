package animal;

public enum Deplacer {
	COURIR(1, "courir"),
	MARCHER(2, "marcher"),
	SAUTER(3, "sauter");
	
	int code;
	String label;
	
	Deplacer(int id, String value){
		code = id;
		label = value;
		
	}
}

	