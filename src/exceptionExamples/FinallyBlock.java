package exceptionExamples;
import java.util.Scanner;


public class FinallyBlock {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age => ");
		int age = sc.nextInt();
		
		
		try
		{
			if(age>18)
			{
				System.out.println("You Can Vote");
			}
			else
			{
				System.out.println("You CANNOT Vote");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Thank You !!");
		}
	}

}
