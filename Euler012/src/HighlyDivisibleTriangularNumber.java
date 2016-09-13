
import java.math.*;
public class HighlyDivisibleTriangularNumber {
	
	
	static long HighlyDivisibleTriangularNumber(int divisors) {
		long natural = 1;
		long num = 1;
		while (true) {
			int num_of_divisors = 0;
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					num_of_divisors += 2;
				}	
			}
			if (num_of_divisors > divisors) {
				return num;
			}
			natural++;
			num+= natural;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(HighlyDivisibleTriangularNumber(500));
	}
}
