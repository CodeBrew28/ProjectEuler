import java.util.ArrayList;


public class AmicableNumbers {

	public static int divisorsum(int a) {
		int sum = 0; 
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return sum;  
	}
	
	public static void main(String[] args) {
		
		int amicableNumberSum = 0;
		boolean[] numbers = new boolean[10000];
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = true;
		}
	
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] == true) {
				int sum1 = divisorsum(i);
				int sum2 = divisorsum(sum1);
				if (i == sum2) {
					if (i != sum1) {
						amicableNumberSum += i;
						amicableNumberSum += sum1;
					}
					//prevents adding the same divisors twice
					numbers[sum1] = false;
				}
			}
		}
		System.out.println(amicableNumberSum);
	
	}
	
}
