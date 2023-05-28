package H_Constructor;

public class C_ParametarizedConstructor {
	public static class Car {
	    private String make;
	    private String model;
	    private int year;

	    // Parameterized constructor that takes three arguments
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter methods for the private instance variables
	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public static void main(String[] args) {
	        // Create a new instance of Car using the parameterized constructor
	        Car myCar = new Car("Honda", "Civic", 2022);

	        // Get the values of the instance variables using the getter methods
	        String make = myCar.getMake();
	        String model = myCar.getModel();
	        int year = myCar.getYear();

	        // Print out the values of the instance variables
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	}

}
