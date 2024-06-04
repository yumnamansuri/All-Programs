package staticFunctions;

public class StaticBlock extends StaticFunction{


	static int k;
	static
	{
		k++;
		System.out.println("Hello!! I'm Static Block");
	}

	public static void main(String[] args) {
		

	}
}
