
public class Acteur {
	protected String nom;
	protected String prenom;
	protected int age;
	protected double montant;
	
	public double getSalaire() {
		return this.montant;
	}
	
	Acteur(String nom,String prenom,int age,double montant){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.montant=montant;
	}
	
	public String toString() {
		return (" Nom: "+this.nom+"\nPrenom: "+this.prenom+"\nAge: "+this.age+"\nMontant: "+this.montant);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getMontant() {
		return this.montant;
	}
}
