package I_OOPS;

class Parent {               //Define a parent class with a method
 public void printMessage() {
     System.out.println("Hello from Parent class!");
 }
}

class Child extends Parent {      //Define a child class that overrides the printMessage() method
 @Override
 public void printMessage() {
     System.out.println("Hello from Child class!");
 }
}

public class C_MethodOverridden {      //Define a class with a main method to test the Parent and Child classes
 public static void main(String[] args) {
     Parent parent = new Parent();           // Create an instance of the Parent class and call its method
     parent.printMessage();            // Output: "Hello from Parent class!"

     Child child = new Child();         // Create an instance of the Child class and call its method
     child.printMessage();            // Output: "Hello from Child class!"

     Parent parent2 = new Child();          // Create a Parent reference to a Child object and call its method
     parent2.printMessage();        // Output: "Hello from Child class!" (because the Child's method is called)
 }
}
