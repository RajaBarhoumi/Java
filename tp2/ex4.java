import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		System.out.println("Entrer un entier:");
	    int x=i.nextInt();
	   
       System.out.println("Entrer la puissance:");
       float n=i.nextFloat();
       if(n<0) {
    	   System.out.println("La puissance doit etre strictement positive");
       }
       
      
       
      double result=Math.pow(x, n);
      System.out.println(x+"^"+n+"="+result);
      
       
	}

}
