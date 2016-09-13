
import java.math.BigInteger;

public class PowerDigitSum {
	
	static long PowerDigitSum(int num) {
		BigInteger powerDigit =  new BigInteger("2").pow(num);
		String digit = powerDigit.toString();
		long sum = 0;
		for (int i = 0; i < digit.length(); i++) {
			sum += Integer.parseInt(digit.substring(i, i+1));
		}
		return sum;
	}
	
	public static void main (String args[]) {
		System.out.println(PowerDigitSum(1000));
	}
}
