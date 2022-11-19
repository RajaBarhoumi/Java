package tp7;

public class Voiture extends Vehicule  {
	public Voiture(String c,int vmax) {
		super(c,vmax);
	}
	public void seDecrire() {
		System.out.println("Class: "+this.getClass().getSimpleName()+":\nVoiture de Couleur: "+this.couleur+" et de Vitesse: "+this.vitesse);
	}
	
	public void seDeplacer() { 
		System.out.println("Je roule");
	}

}
