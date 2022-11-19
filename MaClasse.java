import java.util.Scanner;

public class MaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prenom ? ");
		String prenom = sc.nextLine();
		System.out.println("Quel est votre age ? ");
		int age = sc.nextInt();
		System.out.println("\nBienvenu " + prenom + " !");
		System.out.println("Vous avez " + age + " ans");
		*/
		/*
		MaClasse m = new MaClasse(); // créer un objet de la classe
		m.afficher();
		*/
		
		MaClasse m = new MaClasse(); // créer un objet de la classe
		int age=19;
		String prenom="raja";
		m.afficherAvecAgeEnPara(age);
	}
	
	// A compléter : saisir le nom et l&#39;âge puis afficher le message de bienvenu
	public void afficher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prenom ? ");
		String prenom = sc.nextLine();
		System.out.println("Quel est votre age ? ");
		int age = sc.nextInt();
		System.out.println("\nBienvenu " + prenom + " !");
		System.out.println("Vous avez " + age + " ans");
	}
	
	public void afficherAvecAgeEnPara(int age) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prenom ? ");
		String prenom = sc.nextLine();
		//System.out.println("Quel est votre age ? ");
		//int age = sc.nextInt();
		System.out.println("\nBienvenu " + prenom + " !");
		System.out.println("Vous avez " + age + " ans");
		}

}
