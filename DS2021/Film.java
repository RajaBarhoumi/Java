import java.util.Scanner;

public class Film {
	protected String titre;
    protected String realisateur;
    protected String paysOrigine;
    protected int duree;
    protected int nbplace;
    
    public Film(String titre, String r, String pays, int d) {
        this.titre = titre;
        this.realisateur = r;
        this.paysOrigine = pays;
        this.duree = d;
    }
    
    public int getNbplace() {
        return nbplace;
    }

    public void setNbplace(int nbplace) {
        this.nbplace = nbplace;
    }
    
    public String toString() {
        return this.titre + " de " + this.realisateur + " (" + this.paysOrigine + ")" + " - " + this.duree + "min";
    }
    
    public float totalVenteBillets() {
    	//System.out.println("jjjjj\n");
		int nbEtudiants;
        String msg=("Entrer le nb de places pour l'etudiants");
        Scanner in = new Scanner(System.in);
        do {
			System.out.println(msg);
			nbEtudiants=in.nextInt();
			
			}while(nbEtudiants>this.nbplace);
		
        return nbEtudiants * 2 + (this.nbplace - nbEtudiants) * 3;
    }
}
