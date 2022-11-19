package tp5;

public class testTp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dictionnaire d=new dictionnaire("Larousse",4);
		motDico m=new motDico("Larousse","Amusant");
		motDico mm=new motDico("Livre2","Enuiyant");
		motDico mmm=new motDico("Livre3","Aimable");
		motDico mmmm=new motDico("lala","aa");
		motDico mmmmm=new motDico("lalala","Amusant");
		d.AjoutMot(m);
		d.AjoutMot(mm);
		d.AjoutMot(mmm);
		d.listerDico();
		System.out.println("Le nombre de synonyme= "+d.nbSynonyme(mmmmm));
		System.out.println("La position de cette chaine a cherchee: "+d.chercherMot("Lala"));
		System.out.println("La position de cette chaine a cherchee: "+d.chercherMot("Larousse"));
		

		

	}

}
