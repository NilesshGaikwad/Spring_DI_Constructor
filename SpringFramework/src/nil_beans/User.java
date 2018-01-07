package nil_beans;

public class User {
	String name;
	int age;
	String crush;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCrush() {
		return crush;
	}
	public void setCrush(String crush) {
		this.crush = crush;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public User(String name,String crush,int age,String email) {
		this.name = name;
		this.age= age;
		this.crush=crush;
		this.email=email;
		
	}
public void print() {
		
		System.out.println("Name :- "+this.name);
		System.out.println("Crush :- "+this.crush);
		System.out.println("Age :- "+this.age);
		System.out.println("Email :- "+this.email);
		
	}
	

}
