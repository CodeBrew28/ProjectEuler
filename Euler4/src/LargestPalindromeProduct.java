
public class LargestPalindromeProduct {
	
		static int palindrome = 0;
		
		static int numberOfDigits(int num) {
			int i = 2;
			int temp = num;
			while (temp/10 > 10) {
				i+=1;
				temp = temp/10;
			}
			return i;
		}
	
		static int highestNumber(int digits) {
			String my_num= "";
			for (int i = 0; i < digits; i++) {
				my_num = my_num + "9";
			}
			return Integer.valueOf(my_num);
		}
		
		static int getIntAtPosition(int num, int position) {
			int temp = num;
			
			for (int i=0;i<numberOfDigits(num) - (position);i++) {
				temp = temp/10;
			}
			return temp%10;
		}
		
		static boolean isPalindrome(int num) {
			for (int i =1; i <= numberOfDigits(num)/2;i++)
				if ( getIntAtPosition(num, i) != getIntAtPosition(num, numberOfDigits(num) - (i-1))) {
					return false;
				}
			return true;
			
		}	

		static int LargestPalindromeProduct(int digits){	
			int num1 = highestNumber(digits);
			int num2 = highestNumber(digits);
			
			int limit = highestNumber(digits -1);
			for (int i = num2; i > limit; i-- ) {
				for (int j = num1; j > limit;j--) {
					if (i *j < palindrome) {
						break;
					}
					if (isPalindrome(i * j)) {
						if (i * j > palindrome ) {
							palindrome = i * j;
						}
						break;
					}
				}
			}
			return palindrome;
		}
		
		public static void main(String[] args) {
			System.out.println(LargestPalindromeProduct(3));
		}

}

