package E_ControlStatements;

import java.util.Scanner; // import Scanner class to read user input

public class E_While {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);    // Creating a new Scanner object to read input from the console        
        int a = 0;                             // Initializing the count variable to 0       
        System.out.print("Enter a number: ");
        int num = input.nextInt();                 // Reading the user's input as an integer
        
        while (a <= num) {                         // Starting a while loop that will run as long as count is less than num
           System.out.println("Count is: " + a);  // Printing the current value of count
           a++;                                   // Incrementing the count variable by 1
        }       
        System.out.println("Done!");                  // Printing a message to indicate that the loop has finished
        }
}
