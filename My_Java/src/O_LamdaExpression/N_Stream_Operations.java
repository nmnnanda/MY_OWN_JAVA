package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class N_Stream_Operations {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Example: Filtering numbers greater than 5
	        List<Integer> filteredNumbers = numbers.stream()
	                .filter(num -> num > 5)
	                .collect(Collectors.toList());
	        System.out.println("Filtered Numbers: " + filteredNumbers);

	        // Example: Mapping numbers to their squares
	        List<Integer> squares = numbers.stream()
	                .map(num -> num * num)
	                .collect(Collectors.toList());
	        System.out.println("Squares: " + squares);

	        // Example: Reducing numbers to their sum
	        int sum = numbers.stream()
	                .reduce(0, Integer::sum);
	        System.out.println("Sum: " + sum);

	        // Example: Counting the number of even numbers
	        long count = numbers.stream()
	                .filter(num -> num % 2 == 0)
	                .count();
	        System.out.println("Count: " + count);

	        // Example: Checking if all numbers are even
	        boolean allEven = numbers.stream()
	                .allMatch(num -> num % 2 == 0);
	        System.out.println("Are all numbers even? " + allEven);

	        // Example: Checking if any number is divisible by 5
	        boolean anyDivisibleBy5 = numbers.stream()
	                .anyMatch(num -> num % 5 == 0);
	        System.out.println("Is any number divisible by 5? " + anyDivisibleBy5);

	        // Example: Finding the first even number
	        int firstEven = numbers.stream()
	                .filter(num -> num % 2 == 0)
	                .findFirst()
	                .orElse(0);
	        System.out.println("First even number: " + firstEven);
	    }
	}
