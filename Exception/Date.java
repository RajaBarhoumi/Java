import java.util.Scanner;

public class Date {
	private int jour;
	private int mois;
	private int an;
	
	public Date() throws MoisException,JourException {
		System.out.println("Entrer l annee: ");
		Scanner a=new Scanner(System.in);
		an=a.nextInt();
		System.out.println("Entrer le jour: ");
		//Scanner j=new Scanner(System.in);
		jour= a.nextInt();
		if((jour<1) || (jour )>12) {
		  throw new JourException();
		}
		
			
		
		System.out.println("Entrer le mois: ");
		Scanner m=new Scanner(System.in);
		mois= a.nextInt();
		if((mois<1) || mois>31) {
			  throw new MoisException();
			}
	
	}

}
