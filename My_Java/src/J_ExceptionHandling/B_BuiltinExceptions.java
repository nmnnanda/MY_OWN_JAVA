package J_ExceptionHandling;

public class B_BuiltinExceptions {

	public static void main(String[] args) {
//------------Null Pointer exceptions--------------------------------------------------------------		
		try {
			String str = null;
			System.out.println(str.length());
		}catch(Exception e) {
			System.out.println("length cant be found");
		}
//---------------RunTime exceptions-----------------------------------------------------------		
		try {
            int result = 10 / 0; // Division by zero (ArithmeticException)
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
//----------------Arithmetic exceptions----------------------------------------------------------		
		try {
            int result = 10 / 0; // Division by zero
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
//-----------------ArrayIndexOutOfBoundsException-----------------------------------------------------		
		try {
            int[] arr = {1, 2, 3};
            int element = arr[5]; // Accessing an invalid index
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
//-------------------NumberFormatException---------------------------------------------------		
		try {
            String str = "ABC";
            int number = Integer.parseInt(str); // Parsing a non-numeric string
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
