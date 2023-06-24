package O_LamdaExpression;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class A1_LambdaExpressionsDemo {
	    public static void main(String[] args) {
	        // Lambda Zero: No parameters
	        Runnable lambdaZero = () -> {
	            System.out.println("This is a lambda expression with no parameters.");
	            System.out.println("It can be used to represent a block of code that takes no input.");
	        };

	        // Lambda Single: One parameter
	        // Here, we use the Functional Interface 'Consumer' from the java.util.function package
	        // It represents an operation that takes a single input and returns no result.
	        Consumer<String> lambdaSingle = (name) -> {
	            System.out.println("Hello, " + name + "!");
	            System.out.println("This is a lambda expression with a single parameter.");
	            System.out.println("It can be used to represent a block of code that takes one input.");
	        };

	        // Lambda Multiple: Multiple parameters
	        // Here, we use the Functional Interface 'BiFunction' from the java.util.function package
	        // It represents a function that takes two arguments and produces a result.
	        BiFunction<Integer, Integer, Integer> lambdaMultiple = (a, b) -> {
	            System.out.println("The numbers are: " + a + " and " + b);
	            System.out.println("This is a lambda expression with multiple parameters.");
	            System.out.println("It can be used to represent a block of code that takes multiple inputs.");
	            return a + b; // Return the sum of the two numbers
	        };

	        // Executing the lambda expressions
	        lambdaZero.run(); // Calling the lambda zero expression
	        lambdaSingle.accept("John"); // Calling the lambda single expression
	        int sum = lambdaMultiple.apply(5, 7); // Calling the lambda multiple expression and storing the result
	        System.out.println("The sum is: " + sum);
	    }
	}
