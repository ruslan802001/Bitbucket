package Lesson6;

public class Example {

	public static void main(String[] args) {
		
		student Rasul = new student("Sardor", 28);
		System.out.println(Rasul.getAge());
		System.out.println(Rasul.getName());
		
		Rasul.setAge(25);
		Rasul.setName("Rasul");
		System.out.println(Rasul.getAge());
		System.out.println(Rasul.getName());
		
		int x = 10;
		
		boolean isPositive= x>15 ? true:false;
		System.out.println(isPositive);
		
		int[] numbers = {10,12,50,17};
		System.out.println(numbers[2]);
		
		String[] students = {"RAsul", "Sardor", "Komil"};
		System.out.println(students[0]);
		
		
		
			
	}

}
