import java.util.Scanner;

public class CustomerCreditChecker
{

	public static void main( String[] args )
	{

		//Scanner input = new Scanner( System.in );

		//сделать массивы [] номер кастомера и цена вещи 
		//условие, <1 >4  иначе ошибка 



		// Entities:

		// Customer, Balance, CreditLimit

        // Part 1: declatration
		int customer1 = 0; 
		int customer2 = 1;
		int customer3 = 2;
		int customer4 = 3;

		int balance1 = 150;
		int balance2 = 10;
		int balance3 = 30;
		int balance4 = 20;

        // 10 9 8 7 6 5 4 3 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 -11 -12 -13 -14 -15 -16 -17 -17 -18 -19 -20 
        // ---------------------=---------------------------------------------------------------------------

		int creditLimit1 = 0;
		int creditLimit2 = -20;
		int creditLimit3 = -15;
		int creditLimit4 = -2;


        // Part 2: User Input

		// +, -, *, / arythmetical operators

		// = - asiggnement operator

        // <, >, <=, >=, == : logical operators, returns boolean on conditions: (left less than right, left more than right, left equals to right)

        // &&, || = logical operators, returns boolean on conditions: (left and right are equal, either left or right equal)


// Print the prompt (println = name of function/method, parentheses () -> the place where to put an argument(s) )

		String s1 = "Enter a customer number:";

		System.out.println(s1); // promt for input

	    



// receiving the number
		Scanner input = new Scanner( System.in );
		int giventCustomerNumber = input.nextInt();

// output 
		// System.out.println( "You've entered: " + giventCustomerNumber);


/*
        int age = giventCustomerNumber;


        if(age >= 0 && age <= 130) {

	        if(age <= 9) {
	         	System.out.println("You are child");

	        } else if( age >= 10 && age <= 18) {
	        	System.out.println("You are teenage");

	        } else if(age >= 19 && age <= 40) {
	        	System.out.println("You are youth");

	        } else if(age >= 41 && age <= 59) {
	        	System.out.println("You are middleaged");

	        } else if(age >= 60 && age <= 80) {
	        	System.out.println("You are eldery");

	        } else if(age >= 81) {
	        	System.out.println("You are old");
	        }

        } else {
        	System.out.println("You are stupid, dude");
        }
*/
        

 		if( (giventCustomerNumber >= 0 && giventCustomerNumber <= 3) )
 		{

 			// control statement, checks the expression in parentheses, if true, then executes first block, (if not true,
 			// if "else" block present, executes that block)


// true

 			System.out.println("Exec when if is true");

 		}
 		else
 		{
 			// false

 			System.out.println("Exec when if is not true");
 		}
 		
		// control statement

		// check whether the customer # is in allowed range

	}
}