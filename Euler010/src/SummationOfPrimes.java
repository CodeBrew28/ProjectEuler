
import java.util.*;

public class SummationOfPrimes {

	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	static long summationOfPrimes(int max) {
		long summation = 0;
		int i = 2;
		while (i < max) {
			boolean isPrime = true;
			for (int prime:primes) {
				if (i % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
				summation += i;
			}
			i++;
		}
		return summation;
	}
	
	public static void main(String args[]) {
		System.out.println(summationOfPrimes(2000000));
	}
}
