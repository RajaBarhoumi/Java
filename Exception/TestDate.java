
public class TestDate {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			Date d= new Date();
		}catch (MoisException m ){
			System.out.println("***Date Invalide *** \n"+m.er()); }
			catch (JourException m ){
				System.out.println("***Date Invalide *** \n"+m.er()); 	
		}finally {
			System.out.println("au revoir");
		}

	}

}
