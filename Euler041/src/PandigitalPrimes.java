
public class PandigitalPrimes {

	
	static boolean[] numbers = {false, false, false, false, false, false, false, false, false};

	
	public static boolean checkPandigital() {
		for (int i = 0; i < 7; i++) {  
			if (numbers[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	public static void resetNumbers() {
		for (int i = 0; i < 7; i++) {
			numbers[i] = false;
		}
	}

	
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num/2; i++ ) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int i = 7654321; i > 1234567; i--) {
			int number = i;
			while (number%10 > 0) {
				numbers[number%10 -1] = true;
				number = number / 10;
			}
			if (checkPandigital() && checkPrime(i)) {
				System.out.println(i);
				return;
			}
			resetNumbers();
		}
	}
}
