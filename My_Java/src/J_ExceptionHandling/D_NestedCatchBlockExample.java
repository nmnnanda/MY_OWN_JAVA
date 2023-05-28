package J_ExceptionHandling;

public class D_NestedCatchBlockExample {
	public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result;

            int a = 10;
            int b = 0;
            result = a / b; // Division by zero
            System.out.println("Result: " + result);

            int index = 4;
            System.out.println("Number at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        	System.out.println("Finally block is always executed");//Finally block is always executed
        }
    }
}

