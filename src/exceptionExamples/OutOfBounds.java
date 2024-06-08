// we can write multiplr catch & we can write multiple try & catch inside try &catch

package exceptionExamples;

public class OutOfBounds {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5};
		try
		{
			
			System.out.println(array[10]);
		}
		catch(Exception e)
		{
			System.out.println("Array Out of Bounds "+ e.getMessage());
		}
	}

}
