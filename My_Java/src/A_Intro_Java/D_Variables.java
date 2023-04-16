package A_Intro_Java;

public class D_Variables {
	                                     // static variable  SYNTAX: DataType VariableName = Value
	    static int staticVar = 10;
	                                     // instance variable
	    int instanceVar = 20;

	    public void exampleMethod() {
	                                       // local variable
	        int localVar = 30;

	        System.out.println("Static variable: " + staticVar);
	        System.out.println("Instance variable: " + instanceVar);
	        System.out.println("Local variable: " + localVar);
	    }

	    public static void main(String[] args) {
	    	D_Variables obj1 = new D_Variables();
	    	D_Variables obj2 = new D_Variables();
	                                                                         // accessing static variable using class name
	        System.out.println("Static variable accessed using class name: " + D_Variables.staticVar);
	                                                                         // accessing instance variable using object reference
	        System.out.println("Instance variable accessed using object reference: " + obj1.instanceVar);
	                                                                         // calling method to access local variable
	        obj1.exampleMethod();
	                                                                         // modifying static variable using class name
	        D_Variables.staticVar = 50;
	                                                                         // modifying instance variable using object reference
	        obj1.instanceVar = 40;
	                                                                         // accessing modified variables using object references
	        System.out.println("Modified static variable: " + obj1.staticVar);
	        System.out.println("Modified instance variable for obj1: " + obj1.instanceVar);
	        System.out.println("Instance variable for obj2: " + obj2.instanceVar);
	    }
	}
