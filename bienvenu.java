import java.util.Scanner;
public class bienvenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prenom ? ");
		String prenom = sc.nextLine();
		System.out.println("Quel est votre age ? ");
		int age = sc.nextInt();
		System.out.println("\nBienvenu " + prenom + " !");
		System.out.println("Vous avez " + age + " ans");
	}

}
