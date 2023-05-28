package G_Packages;

public class B_Private_Public_AccessSpecifier1 {

	public static void main(String[] args) {
		B_Private_Public_AccessSpecifier myCar = new B_Private_Public_AccessSpecifier("Toyota", "Corolla", 2010);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        //System.out.println("Year: " + myCar.calculateAge());   **** HERE WILL GET AN ERROR OF PRIVATE ACCESS SPECIFIER******
        // The following line will give a compile-time error because the calculateAge method is private
        // System.out.println("Age: " + myCar.calculateAge());
        System.out.println("Age: " + myCar.getAge()); // This is allowed because the public method calls the private method
    }
}
