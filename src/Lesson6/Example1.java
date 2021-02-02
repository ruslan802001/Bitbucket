package Lesson6;

import java.lang.reflect.Constructor;

public class Example1 {
	
	private String name;
	private String lastname;
	private int age;
	private int SSN;
	
	//Setter
	
	//public void setName(String name) {
		//this.name = name;
	//}
	//public void setLastname(String lastname) {
		//this.lastname = lastname;
	//}
    //public void setAge(int age) {
    	//this.age = age;
    //}
    //public void setSSN(int SSN) {
    	//this.SSN = SSN;
    //}
	
    
   public Example1(String name, String lastname, int age, int SSN) {
	   this.name = name;
	   this.lastname = lastname;
	   this.age = age;
	   this.SSN = SSN;
   }
	//Getter
	
	public String getName() {
		return this.name;
	}
	public String getLastname() {
		return this.lastname;
	}
	public int getAge() {
		return this.age;
	}
	public int getSSN() {
		return this.SSN;
	}
}
