package I_OOPS;

	class Animals {	                        // Parent class
	  void eat() {
	    System.out.println("Animal is eating.");
	  }
	}

	class Mammal extends Animals {	        // Child class of Animal
	  void breathe() {
	    System.out.println("Mammal is breathing.");
	  }
	}

	class Dogs extends Mammal {          	// Child class of Mammal
	  void bark() {
	    System.out.println("Dog is barking.");
	  }
	}

	public class I_MultiLevel_inheritance {	// Main class to test multi-level inheritance
	  public static void main(String[] args) {
	    Dogs dog = new Dogs();
	    dog.eat();            // Inherited from Animal
	    dog.breathe();        // Inherited from Mammal
	    dog.bark();           // Defined in Dog class
	  }
	}
