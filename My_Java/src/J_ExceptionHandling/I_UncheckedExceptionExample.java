package J_ExceptionHandling;
import java.lang.RuntimeException;
public class I_UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int index = 4;

        try {
            int result = numbers[index]; // Accessing an invalid index
            System.out.println("Number at index " + index + ": " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index");
        }
    }
}
/**

• An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime
  Exceptions.
• Unchecked exceptions are extended from the java.lang.RuntimeException class.
• Java Virtual Machine (JVM) handles such exceptions.
• Example : ArithmeticException, ArrayIndexOutOfBoundsException, etc.

*/