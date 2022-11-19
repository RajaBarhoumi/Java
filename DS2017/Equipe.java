
public class Equipe  {
   
	public final int NOMBREJOUEURS=11;
	private String club;
	Joueur [] tab_Joueurs ;
	 Equipe(String club){
		 tab_Joueurs=new Joueur[this.NOMBREJOUEURS];
		 this.club=club; 
	 }
	 
	 public String toString() {
		 for(int i=0;i<NOMBREJOUEURS;i++) {
			 return tab_Joueurs[i].toString();
		 }
		 return ("Club: "+this.club);
	 }
	 
	
	 public void AjoutJoueur(){
	     Joueur j=new Joueur("Nom","Prenom",20,5,"Club");
	        if(this.NOMBREJOUEURS==this.tab_Joueurs.length){
	            System.out.println("Le nombre de joueurs dans un équipe de football ne doit pas dépasser les 11 ");
	        }else if(j.getClub()!=this.club){
	        	System.out.println("ce joueur ne fais pas partie de notre club ! ");
	        	}
	        	else {
	        		tab_Joueurs[this.NOMBREJOUEURS]=j; 
	        }
	    }
	  
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
