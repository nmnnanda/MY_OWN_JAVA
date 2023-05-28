package H_Constructor;

public class E_ThisKeyWordInConstructor {
    private String name;
    private int age;
    
    public E_ThisKeyWordInConstructor(String name, int age) {    // Constructor with parameters
        this.name = name;       // Use 'this' to refer to the instance variable 'name' and set its value
        this.age = age;         // Use 'this' to refer to the instance variable 'age' and set its value
    }
    
    public String getName() {    // Getter method for 'name'
        return name;
    }  
    public void setName(String name) {    // Setter method for 'name'
        this.name = name;                 // Use 'this' to refer to the instance variable 'name' and set its value
    }
    
    public int getAge() {            // Getter method for 'age'
        return age;
    }    
    public void setAge(int age) {    // Setter method for 'age'
        this.age = age;              // Use 'this' to refer to the instance variable 'age' and set its value
    }
    
    public static void main(String[] args) {    // Main method to test the constructor and methods
        E_ThisKeyWordInConstructor person = new E_ThisKeyWordInConstructor("John", 30);   // Create a new object and pass in values for 'name' and 'age'
        
        System.out.println("Name: " + person.getName());        // Print out the values of 'name' and 'age' using the getter methods
        System.out.println("Age: " + person.getAge());
        
        person.setName("Jane");        // Change the value of 'name' using the setter method
        person.setAge(55);        // Change the value of 'age' using the setter method
        
        System.out.println("New name: " + person.getName());        // Print out the updated value of 'name'
        System.out.println("New Age: " + person.getAge());        // Print out the updated value of 'age'
    }
}
