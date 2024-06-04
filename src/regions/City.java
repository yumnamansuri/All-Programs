package regions;

public class City extends StateClass {

	
	private String CityName;

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		this.CityName = cityName;
	}

	@Override
	public String toString() {
		return "City [CityName=" + CityName + "]";
	}

	
	

}
