package L_FileHandling;

	import java.io.*;

	public class F_Deserialization {

	    // Serializable class to be deserialized
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
	        String filename = "student.ser"; // Specify the filename for deserialization

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

//	Deserialization:
//
//		Deserialization is the reverse process of serialization.
//		It is the process of reconstructing an object from a byte stream or another serialized format.
//		Deserialization takes the serialized byte stream and converts it back into an object in memory.
//		It involves recreating the object's state, including its data and class information.
//		Deserialization is commonly used to retrieve objects from storage or receive objects over a network.
		