package I_OOPS;

interface Parent1 {                   //Parent interface 1
 void display1();
}

interface Parent2 {                     //Parent interface 2
 void display2();
}

class Child1 implements Parent1, Parent2 {       //Child class that implements Parent1 and Parent2 interfaces
 int num1, num2, num3;

 public void display1() {
     System.out.println("Number 1 is: " + num1);
 }

 public void display2() {
     System.out.println("Number 2 is: " + num2);
 }

 public void display3() {
     System.out.println("Number 3 is: " + num3);
 }
}

public class K_Multiple_inheritance_Using_Interfece {        //Main class to test the Child class

 public static void main(String[] args) {

	 Child1 obj = new Child1();     // Create an object of Child class

     obj.num1 = 10;     // Set values for all three numbers
     obj.num2 = 20;
     obj.num3 = 30;

     obj.display1();     // Call display methods for all three numbers
     obj.display2();
     obj.display3();
 }
}

/**
 * an interface is a programming construct that allows you to define a set of methods
   and constants without providing an implementation for them. Interfaces are used to
   establish a contract between two or more classes, defining the methods and variables
   that they should implement or provide. 
 
• Interface looks like a class but it is not a class.
• An interface can have methods and variables just like the class but the methods declared in interface are by 
  default abstract means only method syntax is defined not body.
• Interfaces are declared by specifying a keyword “interface”.
• All the interface methods are by default abstract and public.
• Variable names conflicts can be resolved by interface name.
• Defining an interface is similar to defining a class, but a class describes the attributes and behaviors of an 
  object, and an interface contains behaviors that a class implements.
• An interface is not extended by a class it is implemented by a class.
• An interface can extend multiple interfaces.
• A class uses the implements keyword to implement an interface.
• An interface can extend another interface in the same way that a class can extend another class.
  The extends keyword is used to extend an interface.
*/