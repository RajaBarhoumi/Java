
public class Jcc {
	protected Film[] competition;
	protected int annee;
	final int NBFMAX  = 30;
	protected int nbf = 0;
	
	
	Jcc(int taille, int annee) {
	        competition = new Film[taille];
	        this.annee = annee;
	      //  this.nbf = taille;
	}
	
	public void ajoutFilm(Film f) {
        if (this.nbf == this.NBFMAX) {
            System.out.println("La compétition est au complet ");
        } else {
            competition[this.nbf] = f;
            this.nbf++;
        }
    }
	
	
	 public void listeFilmsJCC() {
	        for (int i = 0; i < this.nbf; i++) {
	            System.out.println(competition[i]);
	        }
	 }
	 
	 public float totalVenteBillets() {
	        float somme = 0;
	       // System.out.println("**"+this.nbf);
	        for (int i = 0; i < this.nbf; i++) {
	            somme += competition[i].totalVenteBillets();
	           // System.out.println("  -----  "+somme+"  -----  ");
	           // return somme;
	        }
	        return somme;
	    }
	 
	 public static void main(String[] args) {
		   
		    Jcc list = new Jcc(2, 2021);
	        Film film1 = new Documentaire("Le dernier refuge", "Oussman", "Mali", 86,  "La guerre civile");
	        film1.setNbplace(30);
	        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
	        film2.setNbplace(45);
	        list.ajoutFilm(film2);
	        list.ajoutFilm(film1);
	        
	        list.listeFilmsJCC();
	        
	        System.out.println("Prix: "+list.totalVenteBillets());
	 }
}
