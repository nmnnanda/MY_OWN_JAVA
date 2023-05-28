package H_Constructor;

class Animal {                // Define a class named Animal
    private String name;

    public Animal(String name) {    // Define a constructor that takes a String parameter
        this.name = name;
        System.out.println("Creating Animal: " + name);
    }
}

class Dog extends Animal {              // Define a subclass named Dog that inherits from Animal
    private String breed;

    public Dog(String name, String breed) {    // Define a constructor that takes two String parameters
        super(name);                       // Call the superclass constructor with the name parameter
        this.breed = breed;
        System.out.println("Creating Dog: " + name + " is from " + breed+" Bread.");
    }
}

public class D_SuperKeyWordInConstructor {     // Define a class to test the Dog class
    public static void main(String[] args) {
        Dog myDog = new Dog("Panda", "Labrador");        // Create a new Dog object with a name and a breed
    }
}
