package O_LamdaExpression;

	import java.util.Arrays;

	public class L_Method_References {
	    public static void main(String[] args) {
	        String[] names = {"John", "Jane", "Mike", "Emily", "Tom"};

	        // Example: Method reference to a static method
	        Arrays.sort(names, L_Method_References::compareNames);
	        System.out.println("Sorted names: " + Arrays.toString(names));

	        System.out.println();

	        // Example: Method reference to an instance method of an object
	        StringConcatenator concatenator = new StringConcatenator();
	        Arrays.stream(names)
	                .map(concatenator::concatenateWithHello)
	                .forEach(System.out::println);
	    }

	    public static int compareNames(String name1, String name2) {
	        return name1.compareTo(name2);
	    }
	}

	class StringConcatenator {
	    public String concatenateWithHello(String str) {
	        return "Hello, " + str;
	    }
	}
