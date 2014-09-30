package people;

public class Staff extends Employee{

	public String title;
	
	public Staff(){
		
	}
	
	@Override 
	public String toString(){
		System.out.println("Staff");
		System.out.println(name);
		return "Staff : " + name;
	}
	
	
}
