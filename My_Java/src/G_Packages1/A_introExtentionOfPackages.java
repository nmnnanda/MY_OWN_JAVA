package G_Packages1;

import G_Packages.A_Intro;

public class A_introExtentionOfPackages {

	public static void main(String[] args) {
		A_Intro obj = new A_Intro(10);
        System.out.println("Value is: " + obj.getValue());
    }
}
/**
In this program, we import the "A_Intro" class from the "G_Packges"
 package using the "import" keyword. Then, we create an instance of the class and call its
  "getValue" method to print the value of the instance variable.
*/