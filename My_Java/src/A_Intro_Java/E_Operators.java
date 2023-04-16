package A_Intro_Java;

public class E_Operators {

	public static void main(String[] args) {
		        // Unary operator example       ++, --, !, ~
		        int num = 10;
		        System.out.println("Value of num: " + num); // Output: 10
		        num++;
		        System.out.println("Value of num after increment: " + num); // Output: 11

		        // Arithmetic operator example      
		        int a = 20, b = 10;
		        int add = a + b;
		        int sub = a - b;
		        int mul = a * b;
		        int div = a / b;
		        int mod = a % b;
		        System.out.println("Addition: " + add); // Output: 30
		        System.out.println("Subtraction: " + sub); // Output: 10
		        System.out.println("Multiplication: " + mul); // Output: 200
		        System.out.println("Division: " + div); // Output: 2
		        System.out.println("Modulus: " + mod); // Output: 0

		        // Shift operator example
		        int c = 8; // binary 1000
		        System.out.println("Left shift: " + (c << 2)); // Output: 32 (binary 100000)
		        System.out.println("Right shift: " + (c >> 2)); // Output: 2 (binary 10)

		        // Relational operator example     ==,<=, >=, !=, <, >
		        int x = 5, y = 10;
		        System.out.println("Is x less than y? " + (x < y)); // Output: true
		        System.out.println("Is x equal to y? " + (x == y)); // Output: false
		        System.out.println("Is x not equal to y? " + (x != y)); // Output: true

		        // Bitwise operator example
		        int p = 7; // binary 111
		        int q = 12; // binary 1100
		        System.out.println("Bitwise AND: " + (p & q)); // Output: 4 (binary 100)
		        System.out.println("Bitwise OR: " + (p | q)); // Output: 15 (binary 1111)
		        System.out.println("Bitwise XOR: " + (p ^ q)); // Output: 11 (binary 1011)

		        // Logical operator example
		        boolean bool1 = true, bool2 = false;
		        System.out.println("Logical AND: " + (bool1 && bool2)); // Output: false
		        System.out.println("Logical OR: " + (bool1 || bool2)); // Output: true
		        System.out.println("Logical NOT: " + (!bool1)); // Output: false

		        // Ternary operator example
		        int m = 5, n = 10;
		        int min = (m < n) ? m : n;
		        System.out.println("Minimum value: " + min); // Output: 5

		        // Assignment operator example
		        int r = 10;
		        r += 5; // equivalent to r = r + 5;
		        System.out.println("Value of r after addition: " + r); // Output: 15
		    
		

	}

}
