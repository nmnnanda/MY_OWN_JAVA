package O_LamdaExpression;

public class J_Local_Variable_Capture {
	    public static void main(String[] args) {
	        String greeting = "Hello";

	        // Lambda expression capturing a local variable
	        Runnable runnable = () -> {
	            String name = "John";
	            System.out.println(greeting + ", " + name);
	        };

	        // Executing the lambda expression
	        runnable.run();
	    }
	}
