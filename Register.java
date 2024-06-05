// Date : 5-6-24

package registerInterface;

public interface Register {

	void showReceipt();
	default void getId()
	{
		System.out.println("ID " + 13);
	}
	

	 
	
	
}
