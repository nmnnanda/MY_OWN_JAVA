package M_Threading;

public class C_Process {	                                 // Example of Process
	    public static void main(String[] args) {
	        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "example.txt");// Creating a new process using ProcessBuilder
	        try {
	            Process process = processBuilder.start();	            // Start the process
	            int exitCode = process.waitFor();	            // Wait for the process to terminate
	            System.out.println("Process exited with code: " + exitCode);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
//• A process always allocates separate memory in the system for the execution and has a self-contained 
//  execution environment and executes with the same allocated memory.
//• The Java virtual machine runs as a single process and executes java program within the same process, but if 
//  needed, we can create additional processes using start() of the ProcessBuilder object.
//• For example:
// Process p = new ProcessBuilder(“customProcess”,“args”).start();
