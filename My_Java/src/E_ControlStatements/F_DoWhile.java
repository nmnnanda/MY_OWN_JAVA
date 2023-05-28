package E_ControlStatements;
	import java.util.Scanner;

	public class F_DoWhile {

	    public static void main(String[] args) {	    													
	        Scanner scanner = new Scanner(System.in);       // Create a Scanner object to read user input
	        int sum = 0;	                				// Declare a variable to store the sum    								
	        int input;     // Declare a variable to store the user's input
	        								// Use a do-while loop to repeatedly prompt the user for input
	        							            // until they enter a negative number
	        do {	        					// Prompt the user to enter a number					
	            System.out.print("Enter a positive number (or a negative number to quit): ");	            									
	            input = scanner.nextInt();          // Read the user's input	            							        
	            if (input > 0) {                      // If the user's input is positive, add it to the sum
	                sum += input;
	            }
	        } 	        
	        while (input >= 0);                  // Print the sum of the positive numbers entered by the user	        									    
	        System.out.println("The sum of the positive numbers entered is: " + sum);
	    }
	}
