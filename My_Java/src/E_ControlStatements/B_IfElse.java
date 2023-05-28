package E_ControlStatements;

import java.util.Scanner;

public class B_IfElse {

	    public static void main(String[] args) { 
	                                                       // Create a scanner object to read user input
	        Scanner scanner = new Scanner(System.in);	        
	                                                       // Prompt the user to enter their age
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();	        
	                                              // Use an if-else statement to determine if the user is old enough to vote
	        if (age >= 18) {
	            System.out.println("You are old enough to vote.");
	        } else {
	            System.out.println("You are not old enough to vote.");
	        } 
//------------------------------------------------------------------------------------------------------------------	        
	                                                // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();   
	                                           // Use an if-else statement to determine if the number is positive or negative
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
//-----------------------------------------------------------------------------------------------------------------
	                                                // Prompt the user to enter a character
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);	        
                                            // Use an if-else statement to determine if the character is a vowel or a consonant
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println("The character is a vowel.");
	        } else {
	            System.out.println("The character is a consonant.");
	        }
	        
	    }


}
