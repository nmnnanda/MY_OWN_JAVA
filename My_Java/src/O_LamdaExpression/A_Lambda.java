package O_LamdaExpression;

public class A_Lambda {
	    public static void main(String[] args) {
	        // Example 1: Lambda expression as an anonymous function
	        Runnable runnable = () -> {
	            System.out.println("Hello, World!");
	        };
	        runnable.run();

	        // Example 2: Lambda expression as a functional interface implementation
	        Calculator calculator = (a, b) -> a + b;
	        int result = calculator.calculate(10, 5);
	        System.out.println("Result: " + result);
	    }

	    // Functional interface
	    interface Calculator {
	        int calculate(int a, int b);
	    }
	}

/**

• To put it in other words, the function has no name, return type, or access modifiers (private, public, or protected).
• Anonymous functions are also known as lambda expressions.
• The Lambda expression is used to provide a functional interface implementation.
• A function that can be written independently of any class
• It allows you to iterate over a collection, filter it, and retrieve data
• Syntax:
(parameter list) -> { expression body }
• Examples,
1. (int x, int y) -> { return x + y; }
2. x -> x * x
3. ( ) -> x

*/