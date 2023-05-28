package H_Constructor;

public class B_NoArgumentConstructor {

    public static class Person {          // No-argument constructor
        private String name;
        private int age;
        
        public Person() {
            name = "John Doe";
            age = 18;
        }

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
    }

    public static class Main {
        public static void main(String[] args) {
            Person person = new Person();            // Create a new Person object using the no-argument constructor

            System.out.println("Name: " + person.getName());            // Print out the default name and age of the person
            System.out.println("Age: " + person.getAge());

            person.setName("Nanda");            // Change the name and age of the person using the setters
            person.setAge(20);

            System.out.println("Name: " + person.getName());            // Print out the updated name and age of the person
            System.out.println("Age: " + person.getAge());
        }
    }
}
	