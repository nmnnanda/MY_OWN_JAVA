package O_LamdaExpression;

	import java.util.ArrayList;
	import java.util.List;

	public class E_Lambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Example: Doubling each number using a lambda expression
	        List<Integer> doubledNumbers = new ArrayList<>();
	        numbers.forEach(number -> doubledNumbers.add(number * 2));

	        // Displaying the original and doubled numbers
	        System.out.println("Original Numbers: " + numbers);
	        System.out.println("Doubled Numbers: " + doubledNumbers);
	    }
	}
