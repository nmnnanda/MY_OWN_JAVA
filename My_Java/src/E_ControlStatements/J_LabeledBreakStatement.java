package E_ControlStatements;

	public class J_LabeledBreakStatement {
	    public static void main(String[] args) {
	        
	        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Define a two-dimensional integer array	        
	       outerLoop:             // Define a label for the outer loop	        
	        for (int i = 0; i < numbers.length; i++) {              // Outer loop that iterates over the rows of the array	            
	            for (int j = 0; j < numbers[i].length; j++) {       // Inner loop that iterates over the columns of the array	                
	                System.out.print(numbers[i][j] + " ");          // Print the current number	                
	                if (numbers[i][j] == 9) {                       // If the current number is 5, break out of the outer loop
	                    System.out.println("\nBreaking out of outer loop.");
	                   break outerLoop;                            // labeled break statement
	                }
	            }	            
	            System.out.println();      // Print a newline character after each row
	        }
	    }
	}

//unlabeled form which terminate inner loop
//labeled break, that can be used to terminate the outer loop
