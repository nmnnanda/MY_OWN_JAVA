package J_ExceptionHandling;

public class J_ErrorException {

	public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE]; // Attempt to allocate a huge array
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Out of memory");
        }
    }
}

/**

• Errors in Java are normally overlooked.
• They are irrecoverable.
• They occur due to some scarcity of system resources.
• Error is also one type of unchecked exception.
• They are usually created in response to catastrophic failure
• Example: Hardware error, NoSuchMethodError, OutOfMemoryError, etc.

*/