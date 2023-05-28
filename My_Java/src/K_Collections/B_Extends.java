package K_Collections;
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class B_Extends {

	public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat();  // Output: Animal is eating.
	        dog.bark(); // Output: Dog is barking.
	    }
	}


/**

extends: When a class extends another class, it inherits all the non-private fields and methods of the parent 
class. The derived class (also known as a subclass or child class) can add additional fields and methods or 
override the inherited ones. In other words, extends is used to create an inheritance relationship between 
classes.


*/