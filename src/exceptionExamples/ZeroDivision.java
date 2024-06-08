//Date :- 7-6-24

package exceptionExamples;

public class ZeroDivision {

	
	public static void main(String[] args) {
		int a,b,c;
		a=12;
		b=0;
		
		try
		{
		c=a/b;
		System.out.println("Division not possible by Zero");
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide" +e.getMessage());
		}
	}

}
