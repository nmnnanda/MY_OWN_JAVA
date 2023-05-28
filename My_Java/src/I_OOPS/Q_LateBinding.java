package I_OOPS;

	interface MyInterface1 {	                        // Define a simple interface with a single method
	    void doSomething();
	}

	class MyClass1 implements MyInterface1 {	        // Define two classes that implement the interface
	    public void doSomething() {	                    // Implement the doSomething method
	        System.out.println("MyClass1 is doing something");
	    }
	}

	class MyClass2 implements MyInterface1 {
	    public void doSomething() {	                     // Implement the doSomething method in a different way
	        System.out.println("MyClass2 is doing something differently");
	    }
	}

	public class Q_LateBinding {	                     // Main class to test the program
	    public static void main(String[] args) {
	    	MyInterface1[] array = new MyInterface1[2];	 // Create an array of MyInterface objects containing both MyClass1 and MyClass2 objects
	        array[0] = new MyClass1();
	        array[1] = new MyClass2();

	        for (int i = 0; i < array.length; i++) {	 // Call the doSomething method on each object in the array
	            array[i].doSomething();                  // This will call either MyClass1 or MyClass2's implementation of doSomething
	        }
	    }
	}

/**
	This is an example of late binding because the method to be called is determined at runtime 
	based on the actual type of the object (MyClass1 or MyClass2), rather than at compile time 
	based on the type of the reference.

	During the loop, the doSomething() method will be called once for each object in the array. 
	Since the array contains both MyClass1 and MyClass2 objects, the method will be called in 
	different ways depending on the type of the object. This demonstrates the concept of late 
	binding, where the specific method to be called is determined at runtime based on the actual 
	type of the object, rather than at compile time based on the type of the reference.
*/