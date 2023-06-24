package O_LamdaExpression;

public class K_Static_Variable_Capture {
	    private static String greeting = "Hello";

	    public static void main(String[] args) {
	        // Lambda expression capturing a static variable
	        Runnable runnable = () -> {
	            String name = "John";
	            System.out.println(greeting + ", " + name);
	        };

	        // Executing the lambda expression
	        runnable.run();
	    }
	}
