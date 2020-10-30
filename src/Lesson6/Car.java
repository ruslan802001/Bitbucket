package Lesson6;

public class Car {
	
	private String brand;
	private String model;
	private double HorsePower;
	private String pass = "apple";
	
	public Car(String brand, String model, double HorsePower) {
		this.brand = brand;
		this.model = model;
		this.HorsePower = HorsePower;
		
	}
	public void setCar(String input, String brand, String model, double HorsePower) {
		if(input == this.pass) {
		this.brand = brand;
		this.model = model;
		this.HorsePower = HorsePower;
		}else {
			System.out.println("Wrong Pass");
		}
		
	}

	public String getbrand(String input) {
		if(input == this.pass) {
			return brand;
		}else {
			return "Wrong";
		}
		
		
		
	}
	public String getmodel() {
		return model;
	}
   	public double getHorsePower() {
   		return HorsePower;
   	}
	
	
	
	
}
