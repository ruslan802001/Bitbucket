package Lesson6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ExamFebruary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//  System.out.println("Enter your first number");
		  //int a = input.nextInt();
		  
		 // System.err.println("Enter your second number");
		 // int b = input.nextInt();
		  
		  //double ave = (a+b)/2.0;
		  
		//  System.out.println("Average number is "+ ave);
		  
		  int x = 1548784545;
		  int sum =0;
		  
		  while(x>0) {
			  int remainder = x%10;
			  sum=sum+remainder;
			  x=x/10;
			  
		  } System.out.println(sum);
			
		}
	
		
		
			
	}


