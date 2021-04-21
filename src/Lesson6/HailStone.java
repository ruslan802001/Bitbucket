package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class HailStone {

	
		
		private static final int Integer = 0;

		public static void main(String[] args) throws IOException {
		    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		    BufferedReader in = new BufferedReader(reader);
		    String line;
		    while ((line = in.readLine()) != null) {
		      System.out.println(line);
			  
		      
			  int n = Integer;
		    System.out.print(n);

		    while (n > 1) {
		      if (n % 2 == 0) {
		        n = n / 2;
		        System.out.print(n);
		      } else {
		        n = n * 3 + 1;
		        System.out.print(n);
		      }
		    }
	}

}
}
