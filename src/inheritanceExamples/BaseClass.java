package inheritanceExamples;

public class BaseClass {
	private String name;
	private int amount;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	


	@Override
	public String toString() {
		return "BaseClass [name=" + name + ", amount=" + amount + "]";
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	

}
