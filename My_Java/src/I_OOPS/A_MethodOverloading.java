package I_OOPS;

public class A_MethodOverloading {
    
    public void printNumber(int number) {    // Method that takes a single integer parameter
        System.out.println("The number is: " + number);
    }
    
    public void printNumber(double number) {    // Method that takes a single double parameter
        System.out.println("The number is: " + number);
    }
    
    public void printNumber(int number1, int number2) {    // Method that takes two integer parameters
        System.out.println("The numbers are: " + number1 + " and " + number2);
    }
    
    public void printNumber(String message, int number) {    // Method that takes a string and an integer parameter
        System.out.println(message + " " + number);
    }
    
    public static void main(String[] args) {    // Main method to test the overloading methods
        A_MethodOverloading methods = new A_MethodOverloading();
        
        methods.printNumber(5);        // Call the different overloaded methods
        methods.printNumber(3.14);
        methods.printNumber(7, 8);
        methods.printNumber("The number is:", 10);
    }
}
/**
It allows the class to have more than one method having the same name, if their argument lists are different.
It is not possible by changing the return type of methods.
*/