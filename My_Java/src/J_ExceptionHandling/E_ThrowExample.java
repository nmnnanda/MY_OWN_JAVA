package J_ExceptionHandling;

public class E_ThrowExample {
    public static void main(String[] args) {
        try {
            int age = -1;
            validateAge(age);     //The validateAge method is created to check if the given age is valid.
            System.out.println("Age is valid");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }
}

//throw is an exception used to throw an exception
/**
   throw: The throw keyword is used to explicitly throw an exception from within a method or a block of code.
   It is followed by an instance of an exception class or a subclass of Throwable. When a throw statement is 
   encountered, the program execution is halted, and the specified exception is thrown
*/