package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;

	public class C_Lambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Example: Filtering even numbers using a lambda expression
	        numbers.stream()
	               .filter(num -> num % 2 == 0)
	               .forEach(System.out::println);
	    }
	}
