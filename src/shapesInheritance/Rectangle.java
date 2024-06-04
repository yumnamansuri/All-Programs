package shapesInheritance;

public class Rectangle {

	
	private int length,breadth;
	private int result;

	public void printArea()
	{
		result =  length*breadth;
		
	}
	
	public void printPerimeter()
	{
		result = (length*breadth)*2;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	
}
