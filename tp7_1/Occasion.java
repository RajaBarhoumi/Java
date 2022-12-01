package tp7_1;

public class Occasion extends Voiture {
	private int nbKm;
	private int age;
	public Occasion(String imm,double prix,int nbKm,int age){
		super(imm,prix);
		this.nbKm=nbKm;
		this.age=age;
	}
	public int getNbKm() {
		return this.nbKm;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getPrix() {
		if(this.getNbKm()*this.age>20000*this.age ) {
			return (super.prix-0.5*(this.getNbKm()-(20000*this.age))); 
		}
		return (super.prix+0.5*(20000*this.age-this.getNbKm())); 
	}
	
	public String toString() {
		return (super.toString()+" Nb de Km: "+this.nbKm+" Anciennete: "+this.age+" Prix de vente: "+this.getPrix());
	}

}
