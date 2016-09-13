import java.util.Arrays;


public class SmallestMultiple {
	//Multiples the prime numbers less than the number inputed by a calculated number of times
	//So that the smallest_multiple is divisible by every number less tan the number
	static long SmallestMultiple(int num){	
		long primes[] = new long[num];
		Arrays.fill(primes, 1);
		for (int i = 2; i <= num; i++) {
			if ( primes[i-1] == 1 ) {
				while ( (int) Math.pow(i, primes[i-1] + 1) < num) {
					primes[(int) (Math.pow(i, primes[i-1] + 1) - 1)] = 0;
					primes[i-1] = primes[i-1] + 1;
				}
			}
		}
		long smallest_multiple = 1;
		for (int i = 1; i <= num; i++) {
			if (primes[i-1] != 0) {
				boolean is_prime = true;
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						is_prime = false;
						break;
					}
				}
				if (is_prime) {
					smallest_multiple = (long) (smallest_multiple *   Math.pow(i, primes[i-1]));
				}
					
			}	
		}
		return smallest_multiple;
	}
	
	public static void main(String[] args) {
		System.out.println(SmallestMultiple(20));
	}

}

