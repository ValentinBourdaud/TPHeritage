package animal;

public enum Deplacer {
	
	//Liste des �num�rations 
	COURIR(1, "courir"),
	MARCHER(2, "marcher"),
	SAUTER(3, "sauter");
	
	int code;
	String label;
	
	//Constructeur
	
	Deplacer(int id, String value){
		code = id;
		label = value;
		
	}
}

	