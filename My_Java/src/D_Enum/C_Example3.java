package D_Enum;

public class C_Example3 {
                         // Declare an enum named "Day"
    public enum Day {
                                                        // Declare enum constants and associate integer values with them
        SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
                              // Declare an instance variable to hold the integer value associated with the constant
        private int dayIndex;
                              // Define a constructor that takes an integer argument to set the dayIndex instance variable
        Day(int index) {
            this.dayIndex = index;
        }
                                   // Define a getter method to retrieve the integer value of the dayIndex instance variable
        public int getDayIndex() {
            return dayIndex;
        }
    }
    public static void main(String[] args) {
                                                // Call the getDayIndex() method on the MONDAY constant and print the result
        System.out.println("The integer value of MONDAY is " + Day.MONDAY.getDayIndex());
                     // Print the TUESDAY constant, which will call its toString() method and print the name of the constant
        System.out.println("The name of TUESDAY is " + Day.TUESDAY);
    }
}
