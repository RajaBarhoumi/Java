
public class Roman extends livre{
	protected String auteur;
	protected String editeur;
	Roman(String titre, int id, String domaine, int nbpage,String auteur,String editeur){
		 super(titre, id, domaine, nbpage);
		 this.auteur=auteur;
		 this.editeur=editeur;
	}
	
	 public String toString(){
	        return super.toString()+"\n Auteur: "+this.auteur+"\n Editeur:"+this.editeur; 
	   }
	 
	 public double calculprix(){
		    return (0.05 * this.nbpage)*(1+super.TVA)/100;
		}

}
