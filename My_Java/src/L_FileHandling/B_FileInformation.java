package L_FileHandling;

	import java.io.File;

	public class B_FileInformation {
	    public static void main(String[] args) {
	        // Specify the path to the file
	        String filePath = "C:\\Users\\nanda\\Desktop\\Downloads\\aaexample.txt";

	        // Create a File object
	        File file = new File(filePath);

	        // Check if the file exists
	        if (file.exists()) {
	            // Get file name
	            String fileName = file.getName();
	            System.out.println("File Name: " + fileName);

	            // Get absolute path
	            String absolutePath = file.getAbsolutePath();
	            System.out.println("Absolute Path: " + absolutePath);

	            // Get file size in bytes
	            long fileSize = file.length();
	            System.out.println("File Size: " + fileSize + " bytes");

	            // Check if the file is a directory
	            boolean isDirectory = file.isDirectory();
	            System.out.println("Is Directory: " + isDirectory);

	            // Check if the file is readable
	            boolean isReadable = file.canRead();
	            System.out.println("Is Readable: " + isReadable);

	            // Check if the file is writable
	            boolean isWritable = file.canWrite();
	            System.out.println("Is Writable: " + isWritable);

	            // Get the last modified timestamp
	            long lastModified = file.lastModified();
	            System.out.println("Last Modified: " + lastModified);
	        } else {
	            System.out.println("File does not exist.");
	        }
	    }
	}
