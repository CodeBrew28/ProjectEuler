
public class DigitFactorials {
	
	static int factorials(int i) {
		int number = i;
		int total = 1;
		while (number > 0) {
			total *= number;
			number--;
		}
		return total;
	}

	public static void main(String[] args) {
		int grandtotal = 0;
		for (int i = 3; i < 10000000;i++ ) {
			int num = i;
			int total = 0;
			while (num > 0) {
				total += factorials(num%10);
				num = num / 10;
			}
			if (i ==  total) {
				grandtotal += i;
			}
		}
		System.out.println(grandtotal);
	}
	
	
}
