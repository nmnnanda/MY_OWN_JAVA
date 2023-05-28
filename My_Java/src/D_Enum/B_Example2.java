package D_Enum;

import java.util.Scanner;

public class B_Example2 {
                                      // Define an enum called StringEnum with four values and associate each with a string
    enum StringEnum {
        A("First"),
        B("Second"),
        C("Third"),
        D("ash ");

                                          // Define a private field to store the string value
        private final String value;

                                               // Define a constructor to associate a string with each value
        private StringEnum(String value) {
            this.value = value;
        }

                                                  // Define a method to retrieve the associated string value
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
                                                   // Create a Scanner object to read user input from the console
        Scanner input = new Scanner(System.in);
                                                       // Prompt the user to enter a number between 1 and 4
        System.out.print("Enter a number (1-4): ");
                                                       // Read the user's input and store it in the variable choice
        int choice = input.nextInt();

                             // Declare a variable called result to store the string associated with the user's choice
        String result;
                           // Use a switch statement to set the value of result based on the user's choice
        switch (choice) {
            case 1:
                result = StringEnum.A.getValue(); // Set result to the string associated with the value A
                break;
            case 2:
                result = StringEnum.B.getValue(); // Set result to the string associated with the value B
                break;
            case 3:
                result = StringEnum.C.getValue(); // Set result to the string associated with the value C
                break;
            case 4:
                result = StringEnum.D.getValue(); // Set result to the string associated with the value D
                break;
            default:
                result = "Invalid choice"; // Set result to an error message if the user's choice is not 1-4
                break;
        }

                                              // Print the value of result to the console
        System.out.println("Result: " + result);
    }
}
