import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Prog {
    public static void main( String []args ) throws IOException {
        System.out.println("This is calculator \"Thank you Roma v.1\"");

		System.out.println("Please, enter the desired operation:");
    	// Initializing the Reader
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String s = reader.readLine();


    	// condition if(..condition definition...) {  ....operations... }
    	if (  s.equals("addding")  ) {

			int boxA = Integer.parseInt(args[0]);
        	int boxB = Integer.parseInt(args[1]);
        	int boxC = Integer.parseInt(args[2]);

        	int boxZ = 33;

        	int boxA;
        	boxA = Integer.parseInt(args[0]);

			System.out.println("The result is:");
        	System.out.println( boxA * boxB * boxC );

        // condition didn't succeed else { ...operations.... }
    	} else {
    		System.out.println("Unknown operation given :(");
    	}
	
    	

    }
}