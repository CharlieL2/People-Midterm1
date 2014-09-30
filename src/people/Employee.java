package people;

public class Employee extends Person {

	public String office, salary;
	public MyDate dateHired = new MyDate();

	public Employee() {

	}

	@Override 
	public String toString(){
		System.out.println("Employee");
		System.out.println(name);
		return "Employee : " + name;
}
}
