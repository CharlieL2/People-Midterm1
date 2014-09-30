package people;

public class Faculty extends Employee{
	
	public int officeHours;
	public String rank;

	public Faculty(){
		
	}
	
	@Override 
	public String toString(){
		System.out.println("Faculty");
		System.out.println(name);
		return "Faculty : " + name;
	}
}
