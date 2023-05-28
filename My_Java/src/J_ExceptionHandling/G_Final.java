package J_ExceptionHandling;

public class G_Final {

    public static void main(String[] args) {
    	
//---------------------  final -----------------------------------------------------------------    	
//The final keyword in Java is used to declare that a variable, method, or class cannot be modified or overridden.
    	
    	final int constant = 10;
        // constant = 20; // Compilation error: cannot assign a new value to a final variable
        System.out.println("Constant value: " + constant);

//--------------------  finally------------------------------------------------------------------    	
//The finally block is used in exception handling to specify a block of code that is always executed,
//regardless of whether an exception is thrown or not
        
        try {
            int result = divideNumbers(10, 2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        
//--------------------  finalize------------------------------------------------------------------    	
//The finalize method is a special method defined in the Object class in Java. It is called by the garbage
//collector when an object is about to be reclaimed.
        
        G_Final obj = new G_Final();
        obj = null; // Assigning null to the object reference

        // Run the garbage collector
        System.gc();
    }
    public static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
