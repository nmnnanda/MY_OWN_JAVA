package E_ControlStatements;

import java.util.Scanner;

public class C_IfElseIf {
	    public static void main(String[] args) {
	                                                 // Create a Scanner object to read user input from the console
	        Scanner scanner = new Scanner(System.in);	        
	                                                  // Prompt the user to enter a number between 1 and 10
	        System.out.print("Enter a number between 1 and 10: ");
	        int number = scanner.nextInt();	        
	                                                  // Check if the number is greater than 5
	        if (number > 5) {
	            System.out.println("The number is greater than 5");
	        }
	                                                   // Check if the number is less than or equal to 5 and greater than 0
	        else if (number <= 5 && number > 0) {
	            System.out.println("The number is less than or equal to 5 and greater than 0");
	        }
	                                                         // Check if the number is less than or equal to 0
	        else if (number <= 0) {
	            System.out.println("The number is less than or equal to 0");
	        }
	                                   // If none of the above conditions are true, then the number must be greater than 10
	        else {
	            System.out.println("The number is greater than 10");
	        }
	    }
	}

