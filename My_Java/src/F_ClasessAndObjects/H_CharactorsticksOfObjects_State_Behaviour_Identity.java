package F_ClasessAndObjects;

public class H_CharactorsticksOfObjects_State_Behaviour_Identity {
	    
	    private String name;// State
	    private int age;

	    public H_CharactorsticksOfObjects_State_Behaviour_Identity(String name, int age) {	    // Constructor
	        this.name = name;
	        this.age = age;
	    }

	    public void sayHello() {	    // Behavior
	        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	    }

	    public String getName() {	    // Identity
	        return name;
	    }
	    public void setName(String name) {     // Setter for name field
	    	this.name = name;
	    }	 
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	    	this.age = age;
	    }

	    public static void main(String[] args) {
	        // Create a new Person object
	    	H_CharactorsticksOfObjects_State_Behaviour_Identity person = new H_CharactorsticksOfObjects_State_Behaviour_Identity("John Doe", 30);

	        person.sayHello();	        // Call the sayHello() method

	        System.out.println("Name: " + person.getName());	        // Print the person's name and age
	        System.out.println("Age: " + person.getAge());
	        
	        person.setName("Nande");
	        person.setAge(111);
	        System.out.println();
	        System.out.println("Updated details");
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	}

/**
• State: It contains the attributes and value of an object. In simple words, it represents the data of an object.
• Behavior: It represents the functionality of an object.
• Identity: It is used internally by Java to identify the uniqueness id of the object.

• State: It contains the attributes and value of an object. In simple words, it represents the data of an object.
• Behavior: It represents the functionality of an object.
• Identity: It is used internally by Java to identify the uniqueness id of the object.
*/