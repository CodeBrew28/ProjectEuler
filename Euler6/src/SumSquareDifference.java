
public class SumSquareDifference {

	

	static int SumSquareDifference(int max){			
		//square of sums
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		int square_of_sums = sum * sum;
		
		//sum of squares
		int sum_of_squares = 0;
		for (int i = 1; i <= max; i++) {
			sum_of_squares += i * i;
		}
		
		return square_of_sums - sum_of_squares;
	}
	
	public static void main(String[] args) {
		System.out.println( SumSquareDifference(100));
	}




}
