package tp7_1;

import tp7.Avion;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Option[] Options = new Option[10];
        Options[0] = new Option(1, "option 1", 20);
        Options[1] = new Option(2, "option 2", 70);
        Options[2] = new Option(3, "option 3", 95);

        Voiture[] Voitures = new Voiture[3];
        Voitures[0] = new Occasion("Immatricule 1", 1500, 802, 8);
        Voitures[1] = new Occasion("Immatricule 2", 722, 102, 7);
        Voitures[2] = new Neuve("Immatricule 3", 341);

        ((Neuve) Voitures[2]).addOption(Options[0]);
        ((Neuve) Voitures[2]).addOption(Options[1]);
        ((Neuve) Voitures[2]).addOption(Options[2]);
        
        System.out.println("Affichage par ordre decroissant");
        double max = Voitures[0].getPrix();
        for (int i = 1; i < Voitures.length; i++) {
            if (Voitures[i].getPrix() > max) {
                Voiture v = Voitures[i - 1];
                Voitures[i - 1] = Voitures[i];
                Voitures[i] = v;
                max = Voitures[i].getPrix();
            }

            max = Voitures[i].getPrix();

        }

        for (Voiture voiture : Voitures) {
            System.out.println(voiture.getPrix());
        }


	}

}
