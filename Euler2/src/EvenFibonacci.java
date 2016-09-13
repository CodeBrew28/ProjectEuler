
public class EvenFibonacci {
	static int EvenFib(int max){	
		int a = 1;
		int b = 2;
		int sum = b;
		while (a + b < max) {
			int temp1 = a;
			int temp2 = b;
			a = temp2 + temp1 + temp2;
			b = temp2 + temp1 + temp2 + temp1 + temp2;
			sum += b;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(EvenFib(4000000));
	}
}
