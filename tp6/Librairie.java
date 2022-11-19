
public class Librairie {
	livre [] livreListe;
	protected int capacite=0;
	protected int nb=0;
	
	Librairie(int capacite){
          livreListe=new livre[capacite];
          this.capacite=capacite;
   } 
	
	private int getNb(){
	        return this.nb;
	 }
	
	
	 public void inventaire(){
	        for (int i = 0; i < nb; i++) {
	        	System.out.println("\n** "+(i+1)+" **");
	              System.out.print( livreListe[i].toString());
	            System.out.println("\nprix:"+livreListe[i].calculPrix());
	        }
	    }
	
	private void inventaire(String categ){
        for (int i = 0; i < this.nb; i++) {
          if((livreListe[i].getClass().getSimpleName()).equals(categ)){
             System.out.println(livreListe[i].toString());
          }
        }
  }
	
	public void ajoutLiv(livre liv){
        if(this.nb==this.capacite){
            System.out.println("Taille du Tableau insuffisant!");
        }else{
           livreListe[this.nb]=liv;          
            this.nb++; 
        }
    }
	
	public void suppLiv(int num){
        for (int i = 0; i < this.nb; i++) {
           if(livreListe[i].id==num){
               nb--;
               for (int j = i; j < nb; j++) {
                   livreListe[j]=livreListe[j+1];
               }
           }
        }
   }
	

public static void main(String[] args) {
    Librairie listv=new Librairie(4);
    livre livre1=new Roman("premierRoman", 1, "premierDomaine", 8, "premierAuteur", "premierEditeur");
    livre livre2=new livre("deuxiemeLivre", 2, "deuxiemeDomaine", 5);
    livre livre3=new Magazine("troisiemeMagazine", 3, "troisiemeDomaine", 1, 1);
    
    livre livreN=new Roman("dernierRoman", 10, "dernierDomaine", 20, "dernierAuteur", "dernierEditeur");
   // System.out.println(livre1.getClass().getSimpleName());
 
    
    listv.ajoutLiv(livre1);
    listv.ajoutLiv(livre2);
    listv.ajoutLiv(livre3);
    listv.ajoutLiv(livreN);
    listv.inventaire();
    
    System.out.println("\n** Meme Categorie **\n");
    listv.inventaire("Roman");
   
    //Achat de tous les Romans
    double prix_1, prix_2,tot;
    prix_1=livre1.calculPrix();
    prix_2=livreN.calculPrix();
    tot=prix_1+prix_2;
    System.out.println("Prix total des Romans= "+tot);
    
    
    //La librairie ne peut pas ajouter un nouveau magazine car on a fixer sa taille maximale à 4
    //On doit supprimer un element de la librairie pour ajouter ce magazine on utilisnt la fonction suivante
    
    listv.suppLiv(1);
   
    
}     
}
