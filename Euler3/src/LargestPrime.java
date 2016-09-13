
public class LargestPrime {

	
	static long LargestPrime(long num){	
		long temp = num;
		int divisor = 2;
		long largestPrime = 1;
		while (divisor < temp) {
			while(temp % divisor == 0) {
				temp = temp/divisor;
				largestPrime = divisor;
			}
			divisor++;
		}
		return Math.max(largestPrime, temp);
	}
	
	public static void main(String[] args) {
		System.out.println( LargestPrime( 600851475143L));
	}


}
