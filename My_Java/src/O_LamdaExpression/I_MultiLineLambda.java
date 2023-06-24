package O_LamdaExpression;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Consumer;

	public class I_MultiLineLambda {
	    public static void main(String[] args) {
	        List<String> names = new ArrayList<>();
	        names.add("John");
	        names.add("Jane");
	        names.add("Mike");
	        names.add("Emily");
	        names.add("Tom");

	        // Example: Multiline lambda expression
	        Consumer<String> namePrinter = name -> {
	            String greeting = "Hello";
	            System.out.println(greeting + ", " + name);
	        };

	        // Printing names using the multiline lambda expression
	        names.forEach(namePrinter);
	    }
	}
