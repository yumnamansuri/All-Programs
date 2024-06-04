package members;

public class Manager  extends Members {

private String dept;
	
	public Manager(String name, int age, int phone, String address, double sal,String dept) {
		super(name, age, phone, address, sal);
		this.dept = dept;
	}

	public String getDept() {
        return dept;
    }
	
	@Override
	public String toString() {
		return "Employee [Name: " + getName() + ", "
				+ "Age: " + getAge() + ", "
				+ "Phone Number: " + getPhone() +
	              ", Address: " + getAddress() + ", "
	              + "Salary: " + getSal() + ", "
	             +"Department: " + dept +"]";
	}


}
