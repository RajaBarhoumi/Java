import java.util.Scanner;

public class calculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tab t=new tab();
		
		float moy[];
		float bonus[];
		
		int compt=0;
		boolean code;
		int nb = 0;
		float m;
		Scanner enter=new Scanner (System.in);
		String msg="Entrer le nombre des etudiants: ";
		while(compt<3) {
			System.out.println(msg);
			nb=enter.nextInt();
			if((nb<0)||(nb>tab.nmax)) {
				code=false;
				compt++;
			}else {
				code = true;
				compt=4;
			}
		}
		if(code=true) {
			float noteCtrl[]=new float[nb];
			float noteExam[]=new float[nb];
			System.out.println("Remplissage du tab des notes de controle*");
			tab.remplir(noteCtrl);
			System.out.println("Remplissage du tab des notes d examen*");
			tab.remplir(noteExam);
			System.out.println("Affichage du tableau des notes de controle:");
			tab.lister(noteCtrl);
			System.out.println("Affichage du tableau des notes d examen: ");
			tab.lister(noteExam);
			moy=tab.produit(2, noteExam);
			moy=tab.additionner(noteCtrl, moy);
			System.out.println("Affichage du moy de chaque etudiant");
			tab.lister(moy);
			System.out.println("Affichage du moy de la classe");
			m=tab.somme_element(moy)/nb;
			System.out.println(m);
			bonus=tab.additionner(1.5f, moy);
			System.out.println("Moy de chaque etudiant apres l ajout d un point et demi de bonus");
			tab.lister(bonus);
			
			
		}
		
	
		

	}

}
