
public class Documentaire extends Film{
	 private String sujet;
	 private final float tarif = 2;
	 
	 public Documentaire(String titre, String r, String pays, int d, String sujet) {
	        super(titre, r, pays, d);
	        this.sujet = sujet;
	  }
	 
	 public String toString() {
		 return super.toString()+" Sujet: "+this.sujet;
	 }
	 
	 public float totalVenteBillets() {
	        return super.nbplace * 2;
	 }
}
