package tp7;

abstract class Vehicule implements Descriptible {
	String couleur;
	int vitesse;
	public Vehicule(String c,int vmax) {
		this.couleur=c;
		this.vitesse=vmax;
	}
	abstract public void seDeplacer() ;
	
	public int avoirVitesse() {
		return this.vitesse;
	}

}
