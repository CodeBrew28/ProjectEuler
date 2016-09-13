
public class DigitFifthPowers {

	
	public static void main(String[] args) {
		int validNumberTotal = 0;
		int power = 5;
		for (int i = 2 ; i < Math.pow(10, power + 1); i++) {
			int total = 0;
			int number = i;
			while( number > 0) {
				total += (int) Math.pow(number % 10, power);
				number /= 10;
			}
			if (i == total) {
				validNumberTotal += i;
			}	
		}
		System.out.println(validNumberTotal);
	}
	
}
