package E_ControlStatements;

import java.util.Scanner;

public class D_SwitchCase {

	    	    public static void main(String[] args) {	    	        
	    	                                                  // Create a Scanner object to read user input from the console
	    	        Scanner scanner = new Scanner(System.in);	    	        
	    	                                                     // Prompt the user to enter a number between 1 and 5
	    	        System.out.println("Enter a number between 1 and 5:");	    	        
                                                         	    	        // Read the user input as an integer
	    	        int number = scanner.nextInt();	    	        
	    	                          // Use a switch case statement to perform different actions based on the value of the number
	    	        switch(number) {   	            
	    	                                             // If the number is 1, print "One"
	    	            case 1:
	    	                System.out.println("One");
	    	                break;	    	            
	    	                                            // If the number is 2, print "Two"
	    	            case 2:
	    	                System.out.println("Two");
	    	                break;
	    	                
	    	                                             // If the number is 3, print "Three"
	    	            case 3:
	    	                System.out.println("Three");
	    	                break;	    	                
	    	                                                // If the number is 4, print "Four"
	    	            case 4:
	    	                System.out.println("Four");
	    	                break;	    	                
	    	                                                 // If the number is 5, print "Five"
	    	            case 5:
	    	                System.out.println("Five");
	    	                break;	    	                
	    	                                               // If the number is not between 1 and 5, print an error message
	    	            default:
	    	                System.out.println("Invalid number. Please enter a number between 1 and 5.");
	    	                break;
	    	        }	    	        
	    	                                            // Close the scanner to free up system resources
	    	        scanner.close();
	    	    }
	    	}

