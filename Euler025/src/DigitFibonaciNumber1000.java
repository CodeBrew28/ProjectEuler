import java.math.BigInteger;

public class DigitFibonaciNumber1000 {

	public static void main(String[] args) {
		int iteration = 2;
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(1);
		while (two.toString().length() < 1000) {
			BigInteger temp = one.add(two);
			one = two;
			two = temp;
			iteration ++;
		}
		System.out.println(iteration);
	}
}
