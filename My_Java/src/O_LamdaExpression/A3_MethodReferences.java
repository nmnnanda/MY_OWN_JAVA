package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;

	public class A3_MethodReferences {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("John", "Alice", "Bob");

	        // Static method reference: ClassName::staticMethodName
	        names.forEach(A3_MethodReferences::printName);

	        // Parameter method reference: ClassName::instanceMethodName
	        A3_MethodReferences example = new A3_MethodReferences();
	        names.forEach(example::printUpperCase);

	        // Instance method reference: Object::instanceMethodName
	        names.forEach(String::toUpperCase);

	        // Constructor method reference: ClassName::new
	        names.stream()
	                .map(String::new) // Equivalent to s -> new String(s)
	                .forEach(System.out::println);
	    }

	    // Static method
	    public static void printName(String name) {
	        System.out.println(name);
	    }

	    // Instance method
	    public void printUpperCase(String name) {
	        System.out.println(name.toUpperCase());
	    }
	}
