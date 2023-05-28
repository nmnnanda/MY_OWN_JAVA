package L_FileHandling;

	import java.io.FileWriter;
	import java.io.IOException;

	public class C1_WriteFile {
	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\nanda\\Desktop\\Downloads\\example.txt"; // Path to the file

	        try {
	            // Create a FileWriter object with the specified file path
	            FileWriter fileWriter = new FileWriter(filePath);

	            // Write data to the file
	            fileWriter.write("Hello, World!");
	            fileWriter.write("\nThis is an example of writing into a file.");

	            // Close the FileWriter to release system resources
	           fileWriter.close();

	            System.out.println("Data has been written to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}
