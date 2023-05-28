	package D_Enum;
	
	import java.util.Scanner;
	
	public class A_Example1 {
	
		                                              // Create an enumeration named WeekDays
		public enum WeekDays{
			SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATUTRDAY;
		}

		                                                    // Define the main method
		public static void main (String[] args) {
			
			                                        // Create an object of Scanner class to get user input from the console
			Scanner scanner = new Scanner(System.in);
			
			                                           // Prompt user to enter a day of the week
			System.out.println("Enter the day of the week: ");
			
			                                       // Read user input and store it in a String variable called userInput
			String userInput = scanner.nextLine();
			
			                                    // Convert the user input to uppercase and get the corresponding enum value
			WeekDays days = WeekDays.valueOf(userInput.toUpperCase());
			
			                                       // Check if the day is a working day or a weekend
			if (days == WeekDays.MONDAY || days == WeekDays.TUESDAY || days == WeekDays.WEDNESDAY || days == WeekDays.THURSDAY || days == WeekDays.FRIDAY ) {
				System.out.println("It's a working day!");
			}else 
				System.out.println("It's a weekend!");
		}

	}