import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner prix=new Scanner(System.in);
        System.out.println("enter the price");
        int price=prix.nextInt();
        System.out.println("Enter le pourcentage de remise");
        int pourRemise=prix.nextInt();
        int prix_ar=price-price*pourRemise/100;
        System.out.println("Voici le prix apres la remise: "+prix_ar);
	}

}
