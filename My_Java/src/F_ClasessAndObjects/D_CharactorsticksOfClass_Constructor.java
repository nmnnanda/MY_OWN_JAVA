package F_ClasessAndObjects;

public class D_CharactorsticksOfClass_Constructor {
	    private String name;	    // Declare private instance variables
	    private int age;

	    public D_CharactorsticksOfClass_Constructor(String name, int age) {// Define a constructor with parameters
	        this.name = name;	        // Assign the parameter values to the instance variables
	        this.age = age;
	    }
	    public String getName() {	    // Define a getter method for the name variable
	        return name;
	    }
	    public void setName(String name) {	    // Define a getter method for the name variable
	        this.name = name;
	    }
	    public int getAge() {	    // Define a getter method for the age variable
	        return age;
	    }
	    public void setAge(int age) {	    // Define a Setter method for the age variable
	        this.age = age;
	    }

	    public static void main(String[] args) {
	        // Create a new Person object using the constructor
	    	D_CharactorsticksOfClass_Constructor person = new D_CharactorsticksOfClass_Constructor("John Doe", 30);

	        System.out.println("Name: " + person.getName());	        // Print the person's name and age
	        System.out.println("Age: " + person.getAge());
	        
	        person.setAge(45);
	        person.setName("Nanda");
	        
	        System.out.println("Name: " + person.getName());	        // Print the person's name and age
	        System.out.println("Age: " + person.getAge());
	    }
	}
