
public class cercle {
  private point c;
  private int r;
  public cercle (int r, point c) {
	  this.r=r;
	 //System.out.println("la surface du cercle "+r);
	  c=new point('g',3.2);
     
  }
  
  public void surface() {
	  double pi=3.14;
	  double result= pi*r*r;
	 
	  //return result;
	  System.out.println("sa surface= "+result);
  }
  
  
  public int getRayon() {
	  return r;
  }
  
  public void setRayon (int r) {
	  this.r=r;
  }
  
}
