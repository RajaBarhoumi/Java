import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String semaine[];
		int jour =Integer.parseInt(args[0]);
		semaine = new String[7];
		semaine[0] = "dimanche";
		semaine[1] = "lundi";
		semaine[2] = "mardi";
		semaine[3] ="mercredi";
		semaine[4] = "jeudi";
		semaine[5] ="vendredi";
		semaine[6] ="samedi";
		
		System.out.println("Entrer un jour de la semaine");
		Scanner jr=new Scanner(System.in);
		String jrr=jr.nextLine();
		
		System.out.println("Je prefere " + semaine[jour]);
		
		System.out.println("Mon jour prefere est: "+jrr);
	}

}
