package Lesson6;

public class Object {
	public static void main(String[] args) {
		
		Car mycar = new Car("BMW", "750", 250);
		System.out.println(mycar.getbrand("apple"));
		mycar.setCar("apple", "Mers", "550", 350);
		System.out.println(mycar.getbrand("apple"));
		
		System.out.println(mycar.getmodel());
		mycar.setCar("apple", "Mers", "550", 400);
		System.out.println(mycar.getHorsePower());
	}
	

}
