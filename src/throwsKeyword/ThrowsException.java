package throwsKeyword;


public class ThrowsException {

	public static void main(String[] args) {
			
		try
		{
			checkAge(15);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught => " +e.getMessage());
		}

	}
	
	public static void checkAge(int age) throws Exception
	{
		if(age < 18)
		{
			throw new Exception("Age must be atleat 18");
			
		}
		else
		{
			System.out.println("Age is Valid");
		}
		
	}

}
