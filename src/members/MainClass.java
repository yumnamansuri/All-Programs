package members;

public class MainClass {

	
	public static void main(String[] args) {
		Employee emp = new Employee("Yumna", 21, 1234567890, "Sarkhej", 50000,"SE");
		System.out.println(emp);
		emp.printSalary();
		
		Manager mng = new Manager("Alex",19,1345000334,"Sanad",20000,"HR");
		System.out.println(mng);
		mng.printSalary();

	}

}
