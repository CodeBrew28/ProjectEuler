

import java.math.BigInteger;


public class FactorialDigitSum {

	public static void main (String[] args) {
		BigInteger factorial =  new BigInteger("1");
		for (int i = 1; i <= 100;i++) {
			BigInteger j =  new BigInteger( ((Integer)i).toString());
			factorial = factorial.multiply(j);
		}

		System.out.println(factorial.toString());

		Integer sum = 0;
		BigInteger mysum =  new BigInteger( sum.toString());
		for (int i = 0; i < 180; i++) {
			Integer myint = 10;
			BigInteger j =  new BigInteger( myint.toString());
			mysum = (factorial.mod(j)).add(mysum);
			factorial = factorial.divide(j);
		}
		System.out.println(mysum);
	}
}
