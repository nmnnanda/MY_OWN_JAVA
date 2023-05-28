package J_ExceptionHandling;

public class F_ThrowsExample {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);   //The divideNumbers method is declared with a throws ArithmeticException clause, indicating that it may throw an ArithmeticException.                          
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}
/**

throws: The throws keyword is used in method declarations to specify that the method may throw one or more 
types of exceptions. It is followed by a comma-separated list of exception types. By declaring throws in a 
method signature, you indicate to the caller that they need to handle the specified exceptions or propagate 
them further up the call stack.


*/