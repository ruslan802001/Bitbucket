package Lesson6;

public class NewClass {

	public static void main(String[] args) {
	   
		System.out.println("Before loop");
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			
			if (i==5) {
			continue;
				
			}
			System.out.println("break");
			System.out.println("Continue");
			
		}
		System.out.println("After loop");
}
	}

