
public class Joueur extends Acteur {
	protected String club;
	public Equipe e;
	Joueur(String nom,String prenom,int age,double montant,String club){
		super(nom,prenom,age,montant);
		this.club=club;
	}
	
	Joueur(String nom,String prenom,int age,double montant){
		this(nom,prenom,age,montant,"Club Africain");
	}
	
	public String getClub() {
		return this.club;
	}
	
	public Equipe getEquipe() {
		return this.e;
	}
	
	public double getSalaire() {	
		if((this.age<20)&&(this.age>30)) {
			return ((this.montant*100)/100);
		}else if((this.age<30)&&(this.age>40)){
			return ((this.montant*75)/100);
		}
		return ((this.montant*150)/100);
	}
	
	public String toString() {
		return super.toString()+"\n Salaire: "+this.getSalaire();
	}

}
