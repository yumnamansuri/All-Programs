package regions;

public class StateClass extends Country {
	
	private String StName;

	public String getStName() {
		return StName;
	}

	public void setStName(String stName) {
		this.StName = stName;
	}

	
	public String toStrings() {
		return "StateClass [StName=" + StName + "]";
	}
	


}
