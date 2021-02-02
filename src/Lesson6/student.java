package Lesson6;

public class student {
	

	private String name;
	 private int age;
	 
	 
	 //setter
	 public void setName(String name) {
		 this.name = name;
		 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 //constructor
	 public student(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 //getter
	 
	 public String getName() {
		 return this.name;
		 
	 }
	 
	 public int getAge() {
		 return this.age;
	 }
}
