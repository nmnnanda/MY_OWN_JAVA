package I_OOPS;

	interface MyInterface { 	              // Define a simple interface with a single method
	    void doSomething();
	}

	class MyClass implements MyInterface {    // Define a class that implements the interface
	    
		public void doSomething() {    	      // Implement the doSomething method
	        System.out.println("MyClass is doing something");
	    }

	    public void doSomethingElse() {	      // Define another method that is not part of the interface
	        System.out.println("MyClass is doing something else");
	    }
	}

	public class P_EarlyBinding {        	  // Main class to test the program
	    public static void main(String[] args) {
	        MyClass obj = new MyClass();      // Create an object of the MyClass class

	        MyInterface ref = obj;      	  // Call the doSomething method through the interface reference
	        ref.doSomething();                // This will print "MyClass is doing something"
	                                          // Call the doSomethingElse method directly on the MyClass object
	        obj.doSomethingElse();            // This will print "MyClass is doing something else"
	    }
	}

/**
	This is an example of early binding because the method to be called is determined at compile 
	time based on the type of the reference (MyInterface), rather than at runtime based on the 
	actual type of the object (MyClass).

	Finally, we call the doSomethingElse() method directly on the MyClass object. This method is 
	not part of the MyInterface interface and is not available through the MyInterface reference. 
	This is an example of late binding because the method to be called is determined at runtime 
	based on the actual type of the object (MyClass).
*/