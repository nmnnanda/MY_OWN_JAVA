package I_OOPS;
	 class Person {              	// Create a class called "Person" to represent a person
	    private String name;	    // Private variables to represent the person's name and age
	    private int age;
	    
	    public String getName() {	// Public methods to get and set the person's name and age
	        return name;
	    }	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public int getAge() {
	        return age;
	    }	    
	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	public class D_1_Encapsulation {	        // Create a main class to demonstrate the Person class
	    public static void main(String[] args) {
	        Person person = new Person();	        // Create a new Person object
	        
	        person.setName("John");	                // Set the person's name and age using the public methods
	        person.setAge(30);
	        
	        String name = person.getName();	        // Get the person's name and age using the public methods
	        int age = person.getAge();
	        
	        System.out.println("Name: " + name);    // Print out the person's name and age
	        System.out.println("Age: " + age);
	    }
	}

/**
It is a technique used to hide the internal implementation details of a class
from the outside world, and to only expose a public interface through which other classes
can interact with the object.
*/