package tp4;

public class compte {

	private int numero;
	private float solde=0;
	public static int compt=0;
	
	public compte() {
		compt++;
		this.numero=compt;
		solde=0;
	}
	
	public float deposer(float m) {
		return this.solde+=m;
	}
	public float retirer(float m) {
		return this.solde-=m;
	}
	public float avoirSolde() {
		return this.solde;
	}
	public void transferer(float m,compte c) {
		c.solde+=m;
		this.solde-=m;
	}
	
	public int getNum() {
		return this.numero;
	}
	
	
}
