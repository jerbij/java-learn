import java.util.Scanner;

public class Money
{

	public static void main( String[] args ) {

	    System.out.println("your card balance");

	    Scanner input = new Scanner (System.in);

        int balance;

	    try {
	       balance = input.nextInt ();
	    } catch (Exception e) {
	      	System.out.println("Ulka the best!!!");
	      	return;
	    }
		
		if(balance >= 0) {
			// System.out.println("You will be fine!");

			if(balance >= 100) {
	    	  System.out.println("You will be fine!");
	    	  System.out.println("Cool");

	        } else {
	    	  System.out.println("You will need help!");

	        }

		} else { 
			System.out.println("Errorowich");

		}

	 }

}