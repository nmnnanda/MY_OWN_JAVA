package L_FileHandling;

	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class C_CharactorStream {
	    public static void main(String[] args) {
	        String sourceFile = "C:\\Users\\nanda\\Desktop\\Downloads\\example.txt";   // Specify the name of the source file
	        String targetFile = "C:\\Users\\nanda\\Desktop\\Downloads\\example1.txt";   // Specify the name of the target file

	        // Read data from a file using character stream
	        try (FileReader reader = new FileReader(sourceFile);
	             FileWriter writer = new FileWriter(targetFile)) {

	            int character;   // Variable to hold the character value read from the source file
	            while ((character = reader.read()) != -1) {   // Read characters until the end of the file is reached
	                writer.write(character);   // Write the character data to the target file
	            }
	            System.out.println("File copied successfully!");   // Print a success message

	        } catch (IOException e) {   // Catch any input/output exceptions
	            e.printStackTrace();
	        }
	    }
	}

//	• charactor Streams are used to perform read and write of 16-bit bytes. Classes such as read and
//	write support byte streams.