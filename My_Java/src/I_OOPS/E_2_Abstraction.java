package I_OOPS;

	abstract class Shape {	// Abstract class defining a Shape
	    public abstract double getArea();	    // Abstract method to calculate area
	    public abstract double getPerimeter();	    // Abstract method to calculate perimeter
	}

	class Circle extends Shape {	// Concrete class implementing Shape
	    private double radius;

	    public Circle(double radius) {	    // Constructor
	        this.radius = radius;
	    }
	    public double getArea() {	    // Implementation of getArea method for Circle
	        return Math.PI * radius * radius;
	    }
	    public double getPerimeter() {	    // Implementation of getPerimeter method for Circle
	        return 2 * Math.PI * radius;
	    }
	}
	
	public class E_2_Abstraction {	// Main class to test Shape abstraction
	    public static void main(String[] args) {

	    	Circle circle = new Circle(5); 	        // Create a Circle object and calculate its area and perimeter
	        
	    	System.out.println("Circle area: " + circle.getArea());
	        System.out.println("Circle perimeter: " + circle.getPerimeter());
	    }
	}
/**
	Abstraction is a process where you show only “relevant functional details” 
	and “hide irrelevant details” of an object from the user.
     
     Abstract classes are classes that cannot be instantiated and may contain one or more abstract methods,
	 which are methods that have no implementation and must be implemented by subclasses.

    it refers to the practice of hiding implementation details of a class from its users,
    and instead exposing only the relevant information and functionality.

    while hiding the implementation details of each class from the outside world.
    This makes our code more modular, reusable, and easier to maintain and modify in the future.
*/