
import.java.util.Scanner;

public class heating
{

	
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner( System. in );

		 int meters; 
		 int coefficient;
		 int price;
		 int result; 

		 System.out.print( "Enter meters:");
		 meters = input.nextInt();

		 System.out.print( "Enter coefficient:");
		 coefficient = input.nextInt();

		 System.out.print( "Enter price:");
		 price = input.nextInt();

		 System.out.print( "Enter result:");
		 result = input.nextInt();

		 result = meters * coefficient * price;

		 
 
    System.out.printf( "You should pay for heating:" result);  





	}
}