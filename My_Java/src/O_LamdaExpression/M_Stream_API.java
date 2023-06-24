package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class M_Stream_API {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Example: Filtering even numbers and printing them
	        List<Integer> evenNumbers = numbers.stream()
	                .filter(num -> num % 2 == 0)
	                .collect(Collectors.toList());
	        System.out.println("Even Numbers: " + evenNumbers);

	        // Example: Doubling each number and summing them
	        int sum = numbers.stream()
	                .mapToInt(num -> num * 2)
	                .sum();
	        System.out.println("Sum of Doubled Numbers: " + sum);

	        // Example: Finding the maximum number
	        int max = numbers.stream()
	                .max(Integer::compareTo)
	                .orElse(0);
	        System.out.println("Maximum Number: " + max);
	    }
	}
