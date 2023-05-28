package L_FileHandling;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class C2_ReadFile {
	    public static void main(String[] args) {
	        // Specify the file path
	        String filePath = "C:\\Users\\nanda\\Desktop\\Downloads\\example.txt";

	        try {
	            // Create a File object with the specified file path
	            File file = new File(filePath);

	            // Create a Scanner object to read from the file
	            Scanner scanner = new Scanner(file);

	            // Read the file line by line
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }

	            // Close the scanner to release resources
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filePath);
	        }
	    }
	}
