package tp4;

public class testMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maison m1=new maison("un duplex","Tunis",4,210);
		maison m2=new maison("une villa","Nabeul",5);
		System.out.println(m1);//la fonction toString
		System.out.println(m2);
		m2.setSurface(230);
		System.out.println("Ajout de la surface a m2**");
		System.out.println(m2);
		System.out.println("calcul de la surface de m1 avec le prix de m2 =1000:");
		System.out.println("Le prix de la 1ere maison= "+m1.calculPrix(1000));
		System.out.println("calcul de la surface de m2 avec la formule donnee :");
		System.out.println("Le prix de la 2eme maison= "+m2.calculPrix());
		
	}

}
