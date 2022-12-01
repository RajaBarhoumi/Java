package tp7_1;

public class Option {
	protected int num;
	protected String libelle;
	protected double prix;
	
	public Option(int num,String lib,double prix) {
		this.num=num;
		this.libelle=lib;
		this.prix=prix;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String getLib() {
		return this.libelle;
	}
	
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return("Numero: "+this.getNum()+" Libelle: "+this.getLib()+" Prix: "+this.getPrix());
	}

}
