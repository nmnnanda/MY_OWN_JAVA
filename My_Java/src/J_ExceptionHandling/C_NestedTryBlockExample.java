package J_ExceptionHandling;

public class C_NestedTryBlockExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            int result;

            try {
                // Inner try block
                int a = 10;
                int b = 0;
                result = a / b; // Division by zero
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: Division by zero");
            }

            // Accessing an invalid index
            int index = 4;
            System.out.println("Number at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index");
        }
    }
}
