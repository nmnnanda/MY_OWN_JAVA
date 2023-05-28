package E1_ControlStatements;

public class A_Stars_in_Triangle {
	    public static void main(String[] args) {
	        int rows = 5; // Number of rows in the triangle

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before the stars
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" "); // Print a space
	            }

	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* "); // Print a star followed by a space
	            }

	            // Move to the next line
	            System.out.println(); // Print a new line
	        }
	    }
	}
