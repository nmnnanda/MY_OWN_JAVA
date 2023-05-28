package L_FileHandling;

	import java.io.*;

	public class E_Serialization {

	    // Serializable class to be serialized
	    static class Student implements Serializable {
	        private String name;
	        private int age;
	        private String course;

	        // Constructor
	        public Student(String name, int age, String course) {
	            this.name = name;
	            this.age = age;
	            this.course = course;
	        }

	        // Getters and setters
	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public int getAge() {
	            return age;
	        }

	        public void setAge(int age) {
	            this.age = age;
	        }

	        public String getCourse() {
	            return course;
	        }

	        public void setCourse(String course) {
	            this.course = course;
	        }

	        // Override toString() method for printing object details
	        @Override
	        public String toString() {
	            return "Student{" +
	                    "name='" + name + '\'' +
	                    ", age=" + age +
	                    ", course='" + course + '\'' +
	                    '}';
	        }
	    }

	    public static void main(String[] args) {
	        String filename = "student.ser"; // Specify the filename for serialization

	        // Create an object to be serialized
	        Student student = new Student("John Doe", 20, "Computer Science");

	        // Serialization
	        try {
	            FileOutputStream fileOut = new FileOutputStream(filename); // Open a file output stream
	            ObjectOutputStream out = new ObjectOutputStream(fileOut); // Create an object output stream
	            out.writeObject(student); // Write the object to the output stream
	            out.close(); // Close the object output stream
	            fileOut.close(); // Close the file output stream
	            System.out.println("Serialization successful! Object is saved to " + filename);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialization
	        try {
	            FileInputStream fileIn = new FileInputStream(filename); // Open a file input stream
	            ObjectInputStream in = new ObjectInputStream(fileIn); // Create an object input stream
	            Student deserializedStudent = (Student) in.readObject(); // Read the object from the input stream
	            in.close(); // Close the object input stream
	            fileIn.close(); // Close the file input stream

	            // Print the deserialized object
	            System.out.println("Deserialized object: " + deserializedStudent);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}

//	Serialization:
//
//		Serialization is the process of converting an object into a byte stream or another suitable format.
//		It allows objects to be saved to disk or transmitted over a network.
//		Serialized objects can be stored persistently or sent across different systems and platforms.
//		During serialization, the state of the object is converted into a stream of bytes, including the object's data and its class information.
//		Serialization is typically used for tasks like object persistence, caching, and remote method invocation (RMI).