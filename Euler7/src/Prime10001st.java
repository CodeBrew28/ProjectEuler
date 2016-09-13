import java.util.ArrayList;

public class Prime10001st {
	
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	static int Prime10001st(int num){			
		int i = 2;
		while (primes.size() <= num) {
			boolean isPrime = true;
			for (int prime: primes) {
				if ( i % prime == 0) {
					i++;
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
			}

		}
		return primes.get(num -1);
	}
	
	public static void main(String[] args) {
		System.out.println( Prime10001st(10001));
	}

}
