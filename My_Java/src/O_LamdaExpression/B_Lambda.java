package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;

	public class B_Lambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Example: Summing numbers using a lambda expression
	        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
	        System.out.println("Sum: " + sum);
	    }
	}
