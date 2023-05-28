package E_ControlStatements;

public class K_Continue {
	    public static void main(String[] args) {
	        
	    	for (int i = 1; i <= 10; i++) {
	            if (i == 5) {
	                continue;   // If i is equal to 5, skip the rest of the loop's code and move on to the next iteration
	            }
	            System.out.println(i);
	        }
	    }
	}


