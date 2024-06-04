package members;

public class Members {
	
	
	String name;
	int age;
	int phone;
	String address;
	double sal;
	
	

	public Members(String name, int age, int phone, String address, double sal) {
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
	}

	 public void printSalary() 
	 {
	        System.out.println("Salary: " + sal);
	 }
	 
	 

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public double getSal() {
		return sal;
	}

	

}
