package I_OOPS;

class Animal {                  // Define a parent class named Animal
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {      // Define a child class named Dog that overrides the makeSound() method of Animal
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {         // Define another child class named Cat that also overrides the makeSound() method of Animal
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class B_Methodoverriding {    // Define a test class to create instances of Dog and Cat and call their makeSound() methods
    public static void main(String[] args) {
        Dog myDog = new Dog();        // Create a Dog object and call its makeSound() method
        myDog.makeSound();          // Output: The dog barks
        
        Cat myCat = new Cat();        // Create a Cat object and call its makeSound() method
        myCat.makeSound();          // Output: The cat meows
    }
}

/**
• Declaring a method in sub class which is already present in parent class is known as method overriding.
• A method declared in child class but it is already present in the parent class is known as method overriding.
• The method declared in the parent class is called overridden method
* the method in the child class is called the overriding method.
*/