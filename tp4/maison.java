package tp4;

public class maison {
	private String type;
	private String adr;
	private int nbChambre;
	private float surface;
	public  maison (String adr, String t, int n) {
		this.type=t;
		this.adr=adr;
		this.nbChambre=n;
	}
	public maison(String a,String t,int n,float s) {
		/*this.type=t;
		this.adr=a;
		this.nbChambre=n;
		*/
		this(a,t,n);
		this.surface=s;
	}
	public void setSurface(float s) {
		this.surface=s;
	}
	public float calculPrix(float pmc) {
		return this.surface*pmc;
	}
	public float calculPrix() {
		return this.surface*2100;
	}
	//on la nomme par toString car c'est une fonction qui existe deja dans java donc dans le main on fail l'appel par **m1**
	public String toString() {
		return ("Un appartement de "+this.surface+" m2 a "+this.adr+" avec "+this.nbChambre+" chambres");
	}
}
