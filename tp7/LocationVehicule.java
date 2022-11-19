package tp7;

public class LocationVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule liste[]=new Vehicule[3];
		liste[0]=new Avion("Rouge",50);
		liste[1]=new Voiture("Vert",20);
		liste[2]=new Bateau("Bleu",40);
		
		
		((Avion) liste[0]).seDecrire();
		liste[0].seDeplacer();
		
		((Voiture) liste[1]).seDecrire();
		liste[1].seDeplacer();
		
		((Bateau) liste[2]).seDecrire();
		liste[2].seDeplacer();
		
		

	}

}
