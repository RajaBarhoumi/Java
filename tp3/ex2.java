
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point a = new point('A', 2.5) ;
		point b = new point ('B',5.25) ;
		System.out.println("Premiere cercle: "); 
		cercle c1 = new cercle(2,a) ; c1.surface() ;
		System.out.println("Deuxieme cercle: ");
		cercle c2 = new cercle(3,b); c2.surface() ;
		
		System.out.println("rayon du cercle1: "+c1.getRayon());
		System.out.println("rayon du cercle2: "+c2.getRayon());
		System.out.println("----");
		c1.setRayon(4);
		c1.setRayon(8);
		
		if(c1.getRayon()>c2.getRayon()) {
			System.out.print("la cercle de centre ");
			a.affiche();
			System.out.println(" et de rayon "+c1.getRayon()+" a le plus grand rayon");
		}else {
			System.out.println("la cercle de centre ");
			b.affiche();
			System.out.println("et de rayon "+c2.getRayon()+" a le plus grand rayon");
		}

	}

}

