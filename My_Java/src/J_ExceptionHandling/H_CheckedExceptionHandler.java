package J_ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H_CheckedExceptionHandler {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String filename = userInputScanner.nextLine();

        try {
            readFromFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        userInputScanner.close();
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}

/**

• A checked exception is an exception that is checked by the compiler at the time of compilation, these are also 
  called as compile time exceptions.
• Checked exception are directly sub class of java.lang.Exception class.
• These exceptions occur at compile time and without handling them, the program cannot be executed.
• Example: IOException, ClassNotFoundException, etc.

 */
