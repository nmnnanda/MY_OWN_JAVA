package I_OOPS_1;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your contact number: ");
        String contactNumber = input.nextLine();

        String password = generatePassword(name, contactNumber);
        System.out.println("Your password is: " + password);
    }

    public static String generatePassword(String name, String contactNumber) {
        // Concatenate name and contact number
        String combined = name + contactNumber;

        // Reverse the combined string
        String reversed = new StringBuilder(combined).reverse().toString();

        // Convert reversed string to uppercase
        String uppercase = reversed.toUpperCase();

        // Append "PWD" to the uppercase string
        String password = uppercase + "PWD";

        return password;
    }
}
