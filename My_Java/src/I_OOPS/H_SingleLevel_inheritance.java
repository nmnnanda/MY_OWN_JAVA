package I_OOPS;
	class Wild {	                          // Define the Wild class
	  String name;
	  int age;

	  public Wild(String name, int age) {	  // Define the Wild constructor
	    this.name = name;
	    this.age = age;
	  }

	  public void makeSound() {	              // Define the Wild method
	    System.out.println("The animal makes a sound");
	  }
	}

	class Camel extends Wild {                // Define the Camel class, which inherits from Wild
	  String breed;

	  public Camel(String name, int age, String breed) {	  // Define the Camel constructor
	    super(name, age);
	    this.breed = breed;
	  }

	  public void makeSound() {	                              // Define the Camel method
	    System.out.println("The camel make sound");
	  }
	}

	public class H_SingleLevel_inheritance {               	// Create a program to test the Camel class
	  public static void main(String[] args) {
		  Camel myDog = new Camel("Buddy", 3, "Golden Retriever");	    // Create a new Camel object

	    myDog.makeSound();	                          // Call the makeSound method on the Camel object

	    System.out.println("My Camel's name is " + myDog.name + " and he is " + myDog.age + " years old");	    // Access the name and age fields of the Dog object

	  }
	}
