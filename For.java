import java.util.Scanner;

public class For 
{

public static void main(String[] args) 

{
  int number;
  Scanner input = new Scanner( System.in);

  for (int counter = 0; counter <= 5; counter ++) {

      System.out.println("Enter number:");

      number = input.nextInt();

      for (int counter2 = 0; counter2 < number; counter2 ++ ) {       //  повторяем столько раз, сколько нужно звезд 
       System.out.print( "*");
      }

      System.out.println("");
    }
  }
}