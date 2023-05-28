package G_Packages;

public class B_Private_Public_AccessSpecifier {

    private String make;	// Define private instance variables
    private String model;
    private int year;
    
    public B_Private_Public_AccessSpecifier(String make, String model, int year) {    // Define a public constructor that sets the values of the instance variables
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake() {    // Define public methods to get the values of the instance variables
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    private int calculateAge() {    // Define a private method to calculate the age of the car
        int currentYear = 2023; // Assume the current year is 2023
        return currentYear - year;
    }
    //We also have public methods to get the values of the instance variables, as well as
    //a public method named "getAge" that calls the private method to calculate the age of the car.
    public int getAge() {    // Define a public method to get the age of the car using the private method
        return calculateAge();
    }
}
