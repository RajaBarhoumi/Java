package tp5;

public class dictionnaire {
    private int nbMot;
    private motDico dico[];
    private String nom;
    int len=0;
    public dictionnaire(String nom,int nbMot) {
    	this.nbMot=nbMot;
    	this.dico=new motDico[this.nbMot];
    	this.nom=nom;
    }
    public void AjoutMot(motDico m) {
    	if( len < this.nbMot)
    	{
    	   this.dico[len]=m;
    	len++;
    	}
    	//System.out.println("Definition-----"+len+dico[len-1].getMot());
    }
    public void SuppMot(String ch) {
    	for (int i=0;i<len;i++) {
    		if(this.dico[i].getMot()==ch) {
    			for(int j=i;j<this.nbMot-1;j++) {
    	    		this.dico[j]=this.dico[j+1];
    	    	}
    		}
    	}
    	len--;
    }
    public int chercherMot(String ch) {
    	for(int i=0;i<this.len;i++) {
    		if(this.dico[i].getMot()==ch) {
    			return i;
    		}
    	}
    	return -1;
    }
    public void listerDico() {
    	for(int i=0;i<this.len;i++) {
  
    		System.out.println(this.dico[i].toString());
    	    
    	}
    }
    public int nbSynonyme(motDico m) {
    	int nb=0;
    	for(int i=0;i<this.len;i++) {
    		if(this.dico[i].getDefinition()==m.getDefinition()) {
    			nb++;
    		}
    	}
    	return nb;
    }
}
