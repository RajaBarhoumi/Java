import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner write=new Scanner(System.in);
    	System.out.println("entrer un nombre strictement positif");
        double num=write.nextDouble();
        double result=0;
        if(num<=0) {
        	System.out.println("entrer un nombre strictement positif");
        }else {
        	result=Math.pow(num,3);
        }
        System.out.println(result);
        
     
        
       
        System.out.println("entrer le premier nombre");
        double num1=write.nextDouble();
        System.out.println("entrer le deuxieme nombre");
        double num2=write.nextDouble();
        System.out.println("entrer le troisieme nombre");
        double num3=write.nextDouble();
        System.out.println("entrer le quatrieme nombre");
        double num4=write.nextDouble();
        System.out.println("entrer le cinquieme nombre");
        double num5=write.nextDouble();
        double resultc=0;
        resultc=(Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3)+Math.pow(num4,3)+Math.pow(num5,3));
        System.out.println("la resultats des 5 nombres est: "+resultc);
       
	}

}
