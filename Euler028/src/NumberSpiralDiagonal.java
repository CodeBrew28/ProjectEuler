
public class NumberSpiralDiagonal {
	
	public static void main(String[] args) {
		int total = 1;
		int spiralNumber = 3;
		int increment = 2;
		int number = 1;
		
		while (spiralNumber < 1002 ) {
			//adding numbers of four corners
			number += increment;
			total += number;
			number += increment;
			total += number;
			number += increment;
			total += number;
			number += increment;
			total += number;
			
			//changing increment and spiral number
			increment += 2;
			spiralNumber += 2;
		}
		System.out.println(total);
		
	}
}
