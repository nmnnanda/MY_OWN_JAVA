package L_FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D_ByteStream {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\nanda\\Desktop\\Downloads\\example.txt";   // Specify the name of the source file
        String targetFile = "C:\\Users\\nanda\\Desktop\\Downloads\\example1.txt";   // Specify the name of the target file

        // Write data to a file using byte stream
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {

            int byteData;   // Variable to hold the byte value read from the source file
            while ((byteData = fis.read()) != -1) {   // Read bytes until the end of the file is reached
                fos.write(byteData);   // Write the byte data to the target file
            }
            System.out.println("File copied successfully!");   // Print a success message

        } catch (IOException e) {   // Catch any input/output exceptions
            e.printStackTrace();
        }
    }
}
//• Byte Byte Streams are used to perform input and output of 8-bit bytes. Classes such as FileInputStream and
//FileOutputStream support byte streams.
