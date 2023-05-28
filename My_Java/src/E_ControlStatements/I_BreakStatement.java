package E_ControlStatements;

public class I_BreakStatement {

	public static void main(String[] args) {
	   
		int[] numbers = { 1, 2, 3, 4, 5 };	    
	    for (int i = 0; i < numbers.length; i++) {  // Loop through the array of numbers	      
	      if (numbers[i] == 5) {                 // If the current number is 3, break out of the loop
	        System.out.println("Found 3!");
	        break;                                  // This statement will exit the loop immediately
	      }	      
	      System.out.println("Current number is: " + numbers[i]); // Print the current number
	    }
	    System.out.println("Loop finished");
	  }
}
