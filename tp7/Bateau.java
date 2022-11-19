package tp7;

public class Bateau extends Vehicule  {
	public Bateau(String c,int vmax) {
		super(c,vmax);
	}
	public void seDecrire() {
		System.out.println("Class: "+this.getClass().getSimpleName()+":\nBateau de Couleur: "+this.couleur+" et de Vitesse: "+this.vitesse);
	}
	
	public void seDeplacer() { 
		System.out.println("Je navigue sur l'eau");
	}


}
