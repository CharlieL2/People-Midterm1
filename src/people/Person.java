package people;

public class Person {

	public Person(){
		
	}
	public String name, address, phoneNumber, email;
	
	@Override
	public String toString(){
		System.out.println("Persone");
		System.out.println(name);
		return "Person : " + name;
	}
}
