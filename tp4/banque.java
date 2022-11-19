package tp4;

public class banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compte co1=new compte();
		compte co2=new compte();
		System.out.println("Compte num "+co1.getNum()+" son solde= "+co1.avoirSolde());
		System.out.println("Compte num "+co2.getNum()+" son solde= "+co2.avoirSolde());
        co1.deposer(1200);
        co2.deposer(500);
        System.out.println("Compte num "+co1.getNum()+" son solde= "+co1.avoirSolde());
		System.out.println("Compte num "+co2.getNum()+" son solde= "+co2.avoirSolde());
		co2.transferer(700, co1);
		System.out.println("Solde du compte num "+co1.getNum()+"="+co1.avoirSolde());
		System.out.println("Solde du compte num "+co2.getNum()+"="+co2.avoirSolde());
		if(co1.avoirSolde()<=0) {
			System.out.println("Compte num "+co1.getNum()+" est en rouge.Son solde est: "+co1.avoirSolde());
		}else if(co2.avoirSolde()<=0) {
			System.out.println("Compte num "+co2.getNum()+" est en rouge.Son solde est: "+co2.avoirSolde());
		}
        
	}

}
