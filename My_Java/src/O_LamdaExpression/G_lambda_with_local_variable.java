package O_LamdaExpression;

	import java.util.function.Consumer;

	public class G_lambda_with_local_variable {
	    public static void main(String[] args) {
	        String greeting = "Hello";

	        // Example: Lambda expression with a local variable
	        Consumer<String> greetPrinter = name -> {
	            String message = greeting + ", " + name;
	            System.out.println(message);
	        };

	        // Using the lambda expression with a local variable
	        greetPrinter.accept("John");
	        greetPrinter.accept("Jane");
	        greetPrinter.accept("Mike");
	    }
	}
