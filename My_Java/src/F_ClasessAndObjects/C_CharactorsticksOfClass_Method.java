package F_ClasessAndObjects;
	public class C_CharactorsticksOfClass_Method {
	    
	    public static int add(int a, int b) {	    // This method takes two integer arguments and returns their sum
	        return a + b;
	    }
	    
	    public static int factorial(int n) { 	    // This method takes an integer argument and returns its factorial
	        int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }
	    
	    public static int getLength(String str) { 	    // This method takes a string argument and returns its length
	        return str.length();
	    }
	    
	    public static int arraySum(int[] arr) {	    // This method takes an integer array argument and returns the sum of its elements
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        int sum = add(2, 3); 	        // Testing the add method
	        System.out.println("2 + 3 = " + sum); // Output: 2 + 3 = 5
	        
	        int fact = factorial(5);	        // Testing the factorial method
	        System.out.println("5! = " + fact); // Output: 5! = 120
	        
	        int length = getLength("Hello, World!");	        // Testing the getLength method
	        System.out.println("Length of the string is " + length); // Output: Length of the string is 13
	        
	        int[] arr = {1, 2, 3, 4, 5};	        // Testing the arraySum method
	        int arrSum = arraySum(arr);
	        System.out.println("Sum of the elements in the array is " + arrSum); // Output: Sum of the elements in the array is 15
	    }
	}

	
//Code re usability methods means we can use code many times by declaring only once.
//Code optimization methods means we can reduce the line of code.
//Methods should be declared inside the class.
//It should be defined by method name followed by parenthesis ()
//Some predefined methods in java, is System.out.println(), etc.

