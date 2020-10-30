package Lesson6;

public class HWLesson6 {

	public static void main(String[] args) {
		
		
		System.out.println(calcCM(6, 0));
        System.out.println(calcCM(49));
	}
   public static double calcCM(double feet, double inch) {
	
	   if(feet>=0) {
		   if(inch>=0 && inch<=12) {
			   double feettoCM = feet*30.48;
			   double inchtoCM = inch*2.54;
			   double CM = feettoCM + inchtoCM;
			   return CM;
		   } else {
			   return -1;
		   }
	   } else {
		   return -1;
	   }
	   
   }
  
   public static double calcCM(double inch) {
	  if(inch>=0) {
		  double feet = inch/12.0;
		  return feet;
		  
	  } else {
		  return -1;
	  }
	
   }
   
}
