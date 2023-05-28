package L_FileHandling;

	import java.io.File;
	import java.io.IOException;

	public class A_CreateFile {
	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\nanda\\Desktop\\Downloads\\example.txt"; // Specify the file path and name

	        try {
	            File file = new File(filePath);

	            if (file.createNewFile()) {
	                System.out.println("File created successfully.");
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file.");
	            e.printStackTrace();
	        }
	    }
	}
