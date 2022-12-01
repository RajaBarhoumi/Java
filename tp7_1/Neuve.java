package tp7_1;

public class Neuve extends Voiture{
	Option tab[] = new Option[10];
	private int nb=0;
	public Neuve(String imm,double prix) {
		super(imm,prix);
	}

	@Override
	public double getPrix() {
		double p=0;
		for(int i=0;i<nb;i++) {
			p+= tab[i].getPrix();
		}
		return super.prix+p;
	}
	
	public void addOption(Option o) {
		tab[nb]=o;
		nb++;
	}
	
	public String toString() {
		return super.toString()+" Prix avec options: "+this.getPrix();
	}

}
