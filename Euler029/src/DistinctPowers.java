import java.math.BigInteger;
import java.util.ArrayList;


public class DistinctPowers {

	public static void main(String[] args) {
		ArrayList<BigInteger> powers = new ArrayList<BigInteger>();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {	
				BigInteger temp = BigInteger.valueOf(i).pow(j);
				if (!powers.contains(temp)) {
					powers.add( temp );
				}
			}
		}
		powers.sort(null);
		System.out.println("Distinct Numbers: " + (powers.size() ));
	}
}
