package I_OOPS;
	interface ShapeA {          	// Parent interface
	    void draw();                // abstract method
	}

	class CircleA implements ShapeA {                   	// Child classes that implement Shape interface
	    public void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

	class RectangleA implements ShapeA {
	    public void draw() {
	        System.out.println("Drawing Rectangle");
	    }
	}

	public class O_RunTime_Polymarphisam {        	// Main class to test runtime polymorphism
	    public static void main(String[] args) {
	    	
	    	ShapeA shape;      	        // Declare a Shape variable

	        shape = new CircleA();      // Assign a Circle object to the Shape variable
	        shape.draw();	            // Calls Circle's draw() method

	        shape = new RectangleA();   // Assign a Rectangle object to the Shape variable
	        shape.draw();	            // Calls Rectangle's draw() method
	    }
	}

	/**
	it is a late binding process
	Runtime Polymorphism: It is also called dynamic polymorphism or method overriding. In this 
	type of polymorphism, the method to be called is determined at runtime based on the actual 
	object type that is referred to by the parent reference. The method is first searched in the 
	object's class, and if not found, then in its parent class, and so on up the inheritance 
	hierarchy until the method is found or there are no more parent classes.
	
	Late Binding
• It is a run time process.
• The method definition and method call are linked during the run time.
• Actual object is used for binding.
• Program execution is slower.
• The binding of static, private and final methods are not done.
*/