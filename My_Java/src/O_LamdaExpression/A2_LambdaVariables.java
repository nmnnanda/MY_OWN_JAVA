package O_LamdaExpression;

public class A2_LambdaVariables {

	    // Static variable
	    private static int staticVariable = 10;

	    // Instance variable
	    private int instanceVariable = 20;

	    public static void main(String[] args) {

	        // Local variable
	        int localVariable = 30;

	        // Lambda expression using a parameter
	        // that captures the local, instance, and static variables
	        MyFunctionalInterface lambda = (param) -> {
	            // Accessing the local variable
	            System.out.println("Local variable: " + param);
	            
	            // Accessing the instance variable
	            System.out.println("Instance variable: " + new A2_LambdaVariables().instanceVariable);
	            
	            // Accessing the static variable
	            System.out.println("Static variable: " + staticVariable);
	        };

	        // Calling the lambda expression and passing the local variable as an argument
	        lambda.printVariables(localVariable);
	    }

	    // Functional interface with a single method
	    interface MyFunctionalInterface {
	        void printVariables(int param);
	    }
	}
