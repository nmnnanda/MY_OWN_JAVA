package O_LamdaExpression;

	import java.util.function.BinaryOperator;

	public class F_lambda_with_declared_parameter_ype {
	    public static void main(String[] args) {
	        // Example: Lambda expression with declared parameter type
	        BinaryOperator<Integer> sumCalculator = (Integer num1, Integer num2) -> num1 + num2;

	        // Using the lambda expression to calculate the sum
	        int result = sumCalculator.apply(5, 7);
	        System.out.println("Sum: " + result);
	    }
	}

