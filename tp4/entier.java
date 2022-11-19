package tp4;

public class entier {

	static int valeur=0;
	public static int factoriel(int n) {
		int f=1;
		for (int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static int abs(int n) {
		return Math.abs(n);
	}
	public static void compare(int e1,int e2) {
		if(e1>e2) {
			System.out.println("comparaison: "+e1+">"+e2);
		}else if(e1<e2){
			System.out.println("comparaison: "+e2+">"+e1);
		}
	}
	public static boolean premier(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
