package O_LamdaExpression;

	import java.util.function.*;

	public class H_Functional_Interfaces {
	    public static void main(String[] args) {
	        // Predicate functional interface example
	        Predicate<Integer> isEven = num -> num % 2 == 0;
	        System.out.println("Is 10 even? " + isEven.test(10));
	        System.out.println("Is 7 even? " + isEven.test(7));

	        System.out.println();

	        // Function functional interface example
	        Function<Integer, String> convertToString = num -> String.valueOf(num);
	        System.out.println("Convert 10 to string: " + convertToString.apply(10));
	        System.out.println("Convert 7 to string: " + convertToString.apply(7));

	        System.out.println();

	        // Consumer functional interface example
	        Consumer<String> printMessage = message -> System.out.println("Printing message: " + message);
	        printMessage.accept("Hello, World!");

	        System.out.println();

	        // Supplier functional interface example
	        Supplier<Double> getRandomNumber = () -> Math.random();
	        System.out.println("Random number: " + getRandomNumber.get());
	    }
	}
