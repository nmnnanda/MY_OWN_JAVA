package I_OOPS;
	// Parent class
	class AnimalA {
	    public void makeSound() {
	        System.out.println("The animal makes a sound");
	    }
	}

	// Child classes that extend Animal
	class DogD extends AnimalA {
	    public void makeSound() {
	        System.out.println("The dog says woof!");
	    }
	}

	class CatC extends AnimalA {
	    public void makeSound() {
	        System.out.println("The cat says meow!");
	    }
	} 

	// Main class to test the program
	public class M_4_Polymophisam {
	    public static void main(String[] args) {
	        // Create objects of Animal, Dog, and Cat
	    	AnimalA animal = new AnimalA();
	    	AnimalA dog = new DogD();
	    	AnimalA cat = new CatC();

	        // Call makeSound method on each object
	        animal.makeSound();
	        dog.makeSound();
	        cat.makeSound();
	    }
	}
/**
    Polymorphism is a powerful object-oriented programming concept that allows you to write code 
    that can work with objects of different types, without having to know the exact type of each 
    object at compile time.

	Even though we declare the objects as type Animal, we are able to call the makeSound method
    on each object, and the appropriate implementation of the method is called based on the 
    specific type of each object. This is an example of polymorphism in action, where the same
     method (makeSound) is called on objects of different types (Animal, Dog, and Cat), but each
      object's implementation is used based on its specific class.
*/