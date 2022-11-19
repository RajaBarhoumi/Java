
public class Magazine extends livre {
	protected int mois_parution;
	Magazine(String titre,int id,String domaine,int nb,int m){
		 super(titre, id, domaine,nb);
		 this.mois_parution=m;
	}
	
	public String toString() {
		return super.toString()+"\n Mois de parution: "+this.mois_parution;
	}
	
	public double calculPrix(int bonus) {
		return (0.35 *nbpage)*(1+TVA)+bonus;
	}

}
