package people;

public class Student extends Person {
	
	public Student(){
		
	}
	
	public enum Status{
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}

	public Status classStatus;
	
	@Override 
	public String toString(){
		System.out.println("Student");
		System.out.println(name);
		return "Student : " + name;
	}
}
