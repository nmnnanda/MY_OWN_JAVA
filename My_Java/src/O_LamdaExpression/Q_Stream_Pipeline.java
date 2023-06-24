package O_LamdaExpression;

	import java.util.Arrays;
	import java.util.List;

	public class Q_Stream_Pipeline {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        int sumOfEvenSquares = numbers.stream()
	                .filter(num -> num % 2 == 0)
	                .map(num -> num * num)
	                .reduce(0, Integer::sum);

	        System.out.println("Sum of Squares of Even Numbers: " + sumOfEvenSquares);
	    }
	}
