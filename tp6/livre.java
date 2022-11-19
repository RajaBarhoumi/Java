
public class livre {
	protected String titre;
	protected int id;
	protected final double TVA=10;
	protected String domaine;
	protected int nbpage;
	
	public String toString() {
		return "\n Titre: "+this.titre+".\n Identifiant: "+this.id+".\n Domaine: "+this.domaine+".\n Nombre de pages: "+this.nbpage;
	}
	
	livre(String titre,int id,String domaine,int nbpage){
		this.domaine=domaine;
		this.id=id;
		this.nbpage=nbpage;
		this.titre=titre;
	}
	
	public double calculPrix() {
		return (0.075 *nbpage)*(1+TVA);
	}
}
