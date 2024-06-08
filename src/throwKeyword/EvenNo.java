// The Number entered should not be Even

package throwKeyword;
import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number => ");
		int no = s.nextInt();
		
		try
		{
			checkEven(no);
			System.out.println("Number Entered is Odd");
			
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
		}

		
	}	
	public static void checkEven(int no)
	{
		if(no % 2 == 0)
		{
			throw new  IllegalArgumentException("Number Entered is Even");
		}
	}
	

}
