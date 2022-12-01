package tp7_1;

public abstract class Voiture {
	protected String imm;
	protected double prix;
	
	public Voiture(String imm,double prix) {
		this.imm=imm;
		this.prix=prix;
	}
	
	public String getNum() {
		return this.imm;
	}
	
	abstract  double getPrix() ;
	
	public String toString() {
		return (this.imm);
	}
	

}
