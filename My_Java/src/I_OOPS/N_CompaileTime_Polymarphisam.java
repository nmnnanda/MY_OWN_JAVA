package I_OOPS;
	interface ShapeS {            	// Parent interface
	    void draw();                // abstract method
	}

	class CircleC implements ShapeS {        	// Child classes that implement Shape interface
	    public void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

	class RectangleR implements ShapeS {
	    public void draw() {
	        System.out.println("Drawing Rectangle");
	    }
	}

	public class N_CompaileTime_Polymarphisam {     	// Main class to test compile-time polymorphism
	    public static void main(String[] args) {

	    	ShapeS circle = new CircleC();      	        // Upcasting
	    	ShapeS rectangle = new RectangleR();

	        circle.draw();          	        // Calls Circle's draw() method
	        rectangle.draw();           	        // Calls Rectangle's draw() method
	    }
	}
/**
 it is a early binding process
	Compile-time Polymorphism: It is also called static polymorphism or method overloading.
    In this type of polymorphism, the method to be called is determined at compile-time based 
    on the number, types, and order of arguments passed to it. The correct version of the 
    overloaded method is selected by the compiler during compilation, based on the signature of the 
    method. The method overloading can be done in the same class or in different classes, but the 
    method signatures must be different.
		
	example :
	
	class Math {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

Early Binding
• It is a compile time process.
• The method definition and method call are linked during the compile time.
• Actual object is not used for binding
• Program execution is faster.
• The binding of static, private and final methods are done at compile time.
*/