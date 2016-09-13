
import java.math.BigInteger;
import java.math.*;



public class SelfPowers {
	
	public static void main (String[] args) {
		BigInteger powersum =  new BigInteger("0");
		for (int i = 1; i <= 1000;i++) {
			BigInteger num =  new BigInteger( ((Integer) i).toString());	
			num = num.pow(i);
			powersum = powersum.add(num);
		}
		System.out.println(powersum);
	}

}
