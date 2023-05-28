package F_ClasessAndObjects;

public class B_CharactorsticksOfClass_Field {    
	    // Fields
	    private String name; // A person's name
	    private int age; // A person's age

	    public B_CharactorsticksOfClass_Field(String name, int age) { 	    // Constructor
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() { 	    // Getter for name field
	        return name;
	    }

	    public void setName(String name) { 	    // Setter for name field
	        this.name = name;
	    }

	    public int getAge() {	    // Getter for age field
	        return age;
	    }
	    
	    public void setAge(int age) { // Setter for age field
	        this.age = age;
	    }
	    
	    public static void main(String[] args) {	 // Main method       
	    	B_CharactorsticksOfClass_Field person = new B_CharactorsticksOfClass_Field("John", 30); // Create a new Person object
	        
	        System.out.println("Name: " + person.getName());  // Get and print the person's name and age
	        System.out.println("Age: " + person.getAge());
        
	        person.setName("Jane"); // Set the person's name and age
	        person.setAge(25);
	        
	        System.out.println("Updated Name: " + person.getName()); // Get and print the updated person's name and age
	        System.out.println("Updated Age: " + person.getAge());
	    }
	}
