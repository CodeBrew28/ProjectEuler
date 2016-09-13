import java.util.ArrayList;

//RunTime: 28 seconds

public class PandigitalProducts {
	
	static boolean[] numbers = {false, false, false, false, false, false, false, false, false};

	public static boolean checkNumbers(int num) {
		int number= num;
		while (number%10 > 0) {
			numbers[number%10 -1] = true;
			number = number / 10;
		}
		return true;
	}
	
	public static boolean checkPandigital() {
		for (int i = 0; i < 9; i++) {
			if (numbers[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	public static void resetNumbers() {
		for (int i = 0; i < 9; i++) {
			numbers[i] = false;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> products = new ArrayList<Integer>();
		int sum = 0;
		for (Integer i = 1; i < 10000; i++) {
			for (Integer j = 1; j < 10000; j++)  {
				Integer product = i * j;
				if (i.toString().length() + j.toString().length() + product.toString().length() == 9) {
					if (!i.toString().contains("0") && !j.toString().contains("0") && !product.toString().contains("0")) {
						if (checkNumbers(i) == true && checkNumbers(j) == true && checkNumbers(product) == true && checkPandigital() && !products.contains(product)) {
								products.add(product);
								sum += product;
								System.out.println(i + " * " + j + " = " + product);
						}
						resetNumbers();
					}
				}
			}
		}
		System.out.println("Sum: " + sum);
	}
}

