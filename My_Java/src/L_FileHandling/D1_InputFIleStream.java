package L_FileHandling;

	import java.io.FileInputStream;
	import java.io.IOException;

	public class D1_InputFIleStream {
	    public static void main(String[] args) {
	        String fileName = "C:\\\\Users\\\\nanda\\\\Desktop\\\\Downloads\\\\example.txt"; // Specify the name of the file

	        try (FileInputStream fis = new FileInputStream(fileName)) {
	            int byteData; // Variable to hold the byte value read from the file
	            while ((byteData = fis.read()) != -1) {
	                char character = (char) byteData; // Convert byte to character
	                System.out.print(character);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
