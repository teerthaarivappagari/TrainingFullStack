package models;
 
public class Student {
 
	private int age;
	private String name;
	private String email;
	
	protected Student(int age,String name,String email){
		this.age=age;
		this.email=email;
		this.name=name;
	}
	public int getAge() {return age;}
	public String getName() {return  name;}
	public String getEmail() {return email;}
}
 