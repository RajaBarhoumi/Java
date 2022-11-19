package tp7;

public class Avion extends Vehicule {
	public Avion(String c,int vmax) {
		super(c,vmax);
	}
	public void seDecrire() {
		System.out.println("Class: "+this.getClass().getSimpleName()+":\nAvion de Couleur: "+this.couleur+" et de Vitesse: "+this.vitesse);
	}
	
	public void seDeplacer() { 
		System.out.println("Je Vol");
	}

}
