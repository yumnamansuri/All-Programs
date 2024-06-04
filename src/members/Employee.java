package members;

public class Employee extends Members {

	private String specialization;

	public Employee(String name, int age, int phone, String address, double sal, String specialization) {
		super(name, age, phone, address, sal);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {
		return "Employee [Name: " + getName() + ", "
				+ "Age: " + getAge() + ", "
				+ "Phone Number: " + getPhone() +
	              ", Address: " + getAddress() + ", "
	              + "Salary: " + getSal() + ", "
	               + "Specialization: " + specialization+ "]";
	}

	

	

	
}
