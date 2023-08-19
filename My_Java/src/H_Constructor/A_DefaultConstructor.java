package H_Constructor;

public class A_DefaultConstructor {
	    private int count;	    // Define a private instance variable named count

	    public A_DefaultConstructor() {	    // Define the default constructor
	        count = 12536;	        // Initialize count to 0
	    }

	    public int getCount() {	    // Define a public method named getCount to retrieve the value of count
	        return count;
	    }

	    public static void main(String[] args) {	    // Define the main method to test the class
	    	A_DefaultConstructor obj = new A_DefaultConstructor();	        // Create an instance of DefaultConstructorDemo
	        System.out.println("Initial count value: " + obj.getCount());	        // Display the initial value of count
	    }
	}
