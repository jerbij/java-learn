
import java.util.Scanner;

public class Heating
{
	
	public static void main(String[] args) 
	{
		 final int price = 20;
		 int meters; 
		 double coefficient;

		 double result; 

		 System.out.print( "Enter meters: ");
		 Scanner input = new Scanner(System.in);
		 meters = input.nextInt();

	     if (meters >= 1 && meters <=1000) {
		    
			if(meters <= 15) {
				coefficient = 1;
	    	  // System.out.println(" coefficient - 1");

	        } else if(meters >= 16 && meters <= 30) {
	        	coefficient = 1.1;
	          // System.out.ptintln("coefficient - 1.1 ");
	         
	        } else if(meters >= 31 && meters < 50) {
	        	coefficient = 1.2;
	        	// System.out.ptintln("coefficient - 1.2");
	        
	        } else {
	        	coefficient = 1.5;
	        	// System.out.println("coefficient - 1.5");
	        }


	        result = meters * coefficient * price;

            // to check : System.out.printf: what does it mean?
            System.out.printf( "You should pay for heating: " + result + "\n");

	    } else {
		    System.out.println("Wrong metters value given");
	    }
	}
}