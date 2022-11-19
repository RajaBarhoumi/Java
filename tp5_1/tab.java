import java.util.Scanner;

public class tab {
	static int nmax=40;
	static void remplir(float t[]) {
		Scanner write=new Scanner(System.in);
		for (int i=0;i<t.length;i++) {
			System.out.print("Entrer t["+i+"]=");
			t[i]=write.nextFloat();
		}
	}
	static float somme_element(float t[]) {
		float s=0;
		for(int i=0;i<t.length;i++) {
			s+=t[i];
		}
		return s;
	}
	static float[] additionner(float t1[],float t2[]) {
		int l=0;
		float t[]=new float[t1.length];
		for(int i=0;i<t1.length;i++) {
				t[l]=t1[i]+t2[i];
				l++;
		}
		return t;
	}
	static float [] produit(float x,float t[]) {
		int l=0;
		float t1[]=new float[t.length];
		for(int i=0;i<t.length;i++) {
				t1[l]=t[i]*x;
				l++;
		}
		return t1;
	}
	static float[] additionner(float x, float t[]) {
		int l=0;
		float t1[]=new float[t.length];
		for(int i=0;i<t.length;i++) {
			t1[l]=t[i]+x;
			l++;
	}
	return t1;
	}
	static void lister(float t[]) {
		for(int i=0;i<t.length;i++) {
			System.out.println("Etudiant num "+i+"="+t[i]);
		}
	}

}
