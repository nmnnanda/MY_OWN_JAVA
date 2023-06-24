package O_LamdaExpression;
import java.util.ArrayList;
import java.util.List;

public class D_Lambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mike");
        names.add("Emily");
        names.add("Tom");

        // Example: Printing names using a lambda expression
        names.forEach(name -> System.out.println(name));

        // Adding one more item using a lambda expression
        String additionalName = "Alex";
        names.add(additionalName);

        // Displaying the updated list
        System.out.println("Updated list:");
        names.forEach(name->System.out.println(name));
    }
}
