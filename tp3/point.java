

class point {
	private char id ;
	private double abs;

	public point (char c, double x) { //Constructor: methode sans retour ayant le meme nom que la classe
	id = c ;
	abs = x;
	}
	public void affiche ()
	{ System.out.println(id+" d'abscisse : "+abs); 
		
	}
	public void translate (double dx)
	{ abs += dx ; }

}