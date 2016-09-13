
public class MultiplesOf3And5 {

	static int multipleSumCalculator(int max, int num1, int num2) {
		int sum = 0;
		for (int i = 0; i < max; i += 3) {
			sum+= i;
		}
		for (int i = 0; i < max; i += 5) {
			if (i%3 != 0) {
				sum+= i;
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println( multipleSumCalculator(1000,3,5));
		
	}
}
