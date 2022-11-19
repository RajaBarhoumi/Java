package tp5;

public class motDico {
   private int num;
   static int cmp=0;
   private String mot;
   private String definition;
   public motDico(String mot,String definition) {
	   cmp++;
	   this.num=cmp;
	   this.mot=mot;
	   this.definition=definition;
   }
   public String getMot() {
	   return this.mot;
   }
   public String getDefinition() {
	   return this.definition;
   }
   public void setDefinition(String s) {
	   this.definition=s;
   }
   public void setMot(String s) {
	   this.mot=s;
   }
   public boolean Synonyme(motDico m) {
	   if(m.definition==this.definition) {
		   return true;
	   }
	   return false;
   }
   public String toString() {
	   return ("Dico de nom "+this.getMot()+" et de definition "+this.getDefinition());
   }
}
