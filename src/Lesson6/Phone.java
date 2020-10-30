package Lesson6;

public class Phone {
	private String model;
	private String pass = "123";
	
	public void Set(String pass, String input) {
		if(pass == this.pass) {
			this.model = input;
		}
	}

	public String Get() {
		return model;
	}
}
