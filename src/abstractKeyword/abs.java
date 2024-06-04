package abstractKeyword;

public abstract class abs {
	abstract void run();
	void add()
	{
		
		System.out.println("Hello A....");
	}

}

class B extends abs
{
	void run()
	{
		System.out.println("Hello B...");
	}
}

