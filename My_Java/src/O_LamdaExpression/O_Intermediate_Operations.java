package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class O_Intermediate_Operations {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("John", "Jane", "Mike", "Emily", "Tom");

	        // Example: Filtering names starting with 'J' and converting to uppercase
	        List<String> filteredAndUpperCaseNames = names.stream()
	                .filter(name -> name.startsWith("J"))
	                .map(String::toUpperCase)
	                .collect(Collectors.toList());
	        System.out.println("Filtered and Uppercase Names: " + filteredAndUpperCaseNames);

	        // Example: Sorting names in natural order
	        List<String> sortedNames = names.stream()
	                .sorted()
	                .collect(Collectors.toList());
	        System.out.println("Sorted Names: " + sortedNames);

	        // Example: Limiting the number of names to the first three
	        List<String> limitedNames = names.stream()
	                .limit(3)
	                .collect(Collectors.toList());
	        System.out.println("Limited Names: " + limitedNames);

	        // Example: Skipping the first two names
	        List<String> skippedNames = names.stream()
	                .skip(2)
	                .collect(Collectors.toList());
	        System.out.println("Skipped Names: " + skippedNames);

	        // Example: Distinct names in the list
	        List<String> distinctNames = names.stream()
	                .distinct()
	                .collect(Collectors.toList());
	        System.out.println("Distinct Names: " + distinctNames);
	    }
	}
