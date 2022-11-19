package tp4;

public class calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1ere methode
		System.out.println("1ere methode*");
		System.out.println("factoriel: "+entier.factoriel(5));
		System.out.println("absolu: "+entier.abs(-5));
		System.out.println("premier: "+entier.premier(5));
		//2eme methode
		System.out.println("2eme methode*");
		int n1=7;
		
		entier e=new entier();
		entier e1=new entier();
		System.out.println(n1+"!="+e.factoriel(n1));
		System.out.println("la valeur absolu de "+n1+"="+e.abs(n1));
		e.premier(n1);
		
		System.out.print("1ere incrementation: ");
		entier.valeur++;
		System.out.println(entier.valeur);
		System.out.print("2eme incrementation: ");
		e.valeur++;
		System.out.println(e.valeur);
		
		

	}

}
