import java.util.Random;
import java.util.stream.Stream;

public class DisplayPrimeArrayElements {

	public static void main(String... args) {
		var numbers = new Object[] {
				(byte) 7,
				Float.MIN_VALUE,
				Math.PI,
				-0.2,
				Integer.MAX_VALUE,
				new Random().nextLong()
				};

		Stream.of(numbers).filter(DisplayPrimeArrayElements::isPrime).forEachOrdered(System.out::println);
	}

	private static boolean isPrime(Object number) {
		var prime = false;
		var val = String.valueOf(number);

		var containsExponential = val.contains("E");
		var containsNegativeExponential = val.contains("E-");

		if (containsExponential && !containsNegativeExponential) {
			prime = true;
		} else {
			if (containsNegativeExponential) {
				val = val.split("E-")[0];
			}

			var lastDigit = Integer.valueOf(val.charAt(val.length() - 1));
			
			/* Fun fact:
			 * 
			 * You can't use (number % 2 == 1) to tell if an Integer is not prime,
			 * because in negative numbers the remainder may be -1.
			 */

			if (lastDigit % 2 == 0) {
				prime = true;
			}
		}

		return prime;
	}

}
