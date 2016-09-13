
public class NumberLetterCounts {

	private static final String thousand = "thousand";
	private static final String hundred = "hundred";
	private static final String[] tensNames = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
	private static final String[] numNames = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
		"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen" , "eighteen", "nineteen"};
	
	public static String numToString(int n) {
		String string = "";
		if (n==0) {
			return "zero";
		}
		int number = n;
		if (number/1000 != 0) {
			string += numNames[number/1000 -1 ];
			string += thousand;
			number = number%1000;
			if (number != 0) {
				string+= "and";
			}
		}
		if (number/100 != 0) {
			string += numNames[number/100 -1];
			string += hundred;
			number = number%100;
			if (number != 0) {
				string+= "and";
			}
			
		}

		if (number >= 20) {
			string += tensNames[number/10 -2];
			number = n%10;
			if (number != 0) {
				string += numNames[number -1]; 
			}
		} else if (number > 0) {
			string += numNames[number -1]; 
		}
		return string;
	}
	
	public static void main(String[] args) {
		int letterCount= 0;
		for (int i = 1; i <= 1000; i++) {
			letterCount += numToString(i).length();
		}
		System.out.println(letterCount);
		
	}
	
}
