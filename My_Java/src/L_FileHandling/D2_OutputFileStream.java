package L_FileHandling;

	import java.io.FileOutputStream;
	import java.io.IOException;

	public class D2_OutputFileStream {
	    public static void main(String[] args) {
	        String fileName = "C:\\\\Users\\\\nanda\\\\Desktop\\\\Downloads\\\\example.txt";   // Specify the name of the output file

	        // Write data to the file using output stream
	        try (FileOutputStream fos = new FileOutputStream(fileName)) {
	            String data = "Hello, World!";   // Data to be written to the file
	            byte[] byteData = data.getBytes();   // Convert the string to byte array

	            fos.write(byteData);   // Write the byte array to the file
	            System.out.println("Data written to the file successfully!");   // Print a success message

	        } catch (IOException e) {   // Catch any input/output exceptions
	            e.printStackTrace();
	        }
	    }
	}
