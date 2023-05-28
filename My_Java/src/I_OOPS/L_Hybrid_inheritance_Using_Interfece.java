package I_OOPS;

	interface ParentA {             	// Parent interface 1
	    void display1();
	}

	interface ParentB {	                // Parent interface 2
	    void display2();
	}

	class Child2 implements ParentA {     	// Child class that implements Parent1 interface
	    int num1;

	    public void display1() {
	        System.out.println("Number 1 is: " + num1);
	    }
	}

	class GrandChild extends Child2 implements ParentB {      	// GrandChild class that extends Child class and implements Parent2 interface
	    int num2, num3;

	    public void display2() {
	        System.out.println("Number 2 is: " + num2);
	    }

	    void display3() {
	        System.out.println("Number 3 is: " + num3);
	    }
	}

	public class L_Hybrid_inheritance_Using_Interfece {      	// Main class to test the GrandChild class
	    public static void main(String[] args) {

	    	GrandChild obj = new GrandChild();        	        // Create an object of GrandChild class

	        obj.num1 = 110;         	        // Set values for all three numbers
	        obj.num2 = 210;
	        obj.num3 = 310;

	        obj.display1();           	        // Call display methods for all three numbers
	        obj.display2();
	        obj.display3();
	    }
	}
