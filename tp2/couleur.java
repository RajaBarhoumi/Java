import java.util.Scanner;

public class couleur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("entrer le code couleur");
        Scanner color=new Scanner(System.in);
        int c=color.nextInt();
        switch(c) {
        case 1 : System.out.println("Rouge");break;
        case 2: System.out.println("Orange");break;
        case 3: System.out.println("Jaune");break;
        case 4: System.out.println("Vert");break;
        case 5: System.out.println("Bleu");break;
        case 6: System.out.println("Indigo");break;
        case 7: System.out.println("Violet");break;
        }
	}

}
