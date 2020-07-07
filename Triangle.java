
public class Triangle 

{
	public static void main(String[] args) 

{

	triangle1(); 
	triangle2();
	triangle3();
	triangle4();

	
}

public static void triangle1() {

    for (int s = 1; s <= 10; s ++)                     //rows   
	    
	    { 

        for (int s2 = 1; s2 <= s; s2 ++)        //columns
            {
		        System.out.print( "*");  
            }

            System.out.println();
		}
	}

public static void triangle2() 

{

   for (int i = 10; i >=1; i--) 

   {
        for (int j = 1; j <= i; j++)
        {
        	System.out.print( "*"); 
        }

        System.out.println(); 

   }

}

public static void triangle3() 
{

  // 10,9,8,7,6,5,4,3,2,1
   //System.out.println("Lets start the outer loop (k var) with the value of 10");
	//int counter = 0;
   for (int k = 10; k >= 1; k--) // the rows
   {
   	// start of outer loop boundaries

   	// 10, 9, 8, 7, 6, 5

   	// 9, 8, 7, 6, 5, 4

// 0, 1, 2, 3, 4
        for (int m = 1; m <= 10 - k; m++) // spaces
        
        {  
        	System.out.print(" ");
        	
        }

        for (int m = 1; m <= k; m++) // stars
        {
        	System.out.print( "*"); 

        }
        System.out.println();

    // end of outer loop boundaries
    }
}


public static void triangle4() 
{

  // 10,9,8,7,6,5,4,3,2,1
   //System.out.println("Lets start the outer loop (k var) with the value of 10");
	//int counter = 0;
   for (int k = 9; k >= 0; k--) // the rows
   {
   	// start of outer loop boundaries

   	// 10, 9, 8, 7, 6, 5

   	// 9, 8, 7, 6, 5, 4

   	
        for (int m = 1; m <= k; m++) // spaces
        
        {  
        	System.out.print(" ");
        	
        }

// 1, 2, 3, 4, 5, 6...
// 10, 9, 8, 7
//  1, 2,         
        for (int m = 1; m <= 10 - k; m++) // stars
        {
        	System.out.print( "*"); 

        }
        System.out.println();

    // end of outer loop boundaries
    }
}

}
