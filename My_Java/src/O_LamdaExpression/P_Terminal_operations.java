package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class P_Terminal_operations {
	    public static void main(String[] args) {
	        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig");

	        // Example: Collecting elements into a new list
	        List<String> collectedList = fruits.stream()
	                .filter(fruit -> fruit.startsWith("B"))
	                .collect(Collectors.toList());
	        System.out.println("Collected List: " + collectedList);

	        // Example: Joining elements into a single string
	        String joinedString = fruits.stream()
	                .map(String::toUpperCase)
	                .collect(Collectors.joining(", "));
	        System.out.println("Joined String: " + joinedString);

	        // Example: Finding the maximum element
	        String max = fruits.stream()
	                .max(String::compareTo)
	                .orElse("");
	        System.out.println("Maximum Element: " + max);

	        // Example: Checking if any element satisfies the condition
	        boolean anyMatch = fruits.stream()
	                .anyMatch(fruit -> fruit.length() > 5);
	        System.out.println("Any element satisfies the condition? " + anyMatch);

	        // Example: Iterating over elements and performing an action
	        fruits.stream()
	                .forEach(System.out::println);
	    }
	}
