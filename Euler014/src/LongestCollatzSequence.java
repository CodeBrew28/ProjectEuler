
public class LongestCollatzSequence {

	public static void main (String[] args) {
		long maxCount = 0;
		long maxStartingNumber = 0;
		long[] previousCounts = new long[1000000];
		for (int i = 0; i<1000000;i++) {
			previousCounts[i] = 0;
		}
		previousCounts[1] = 1;
		
		for (int i = 2; i < 1000000;i++) {
			long count = 0;
			long number = i;
			while (number != 1 && number >= i) {
				count ++;
				if (number%2 == 0) {
					number = number /2;
				} else {
					number = (3 * number) + 1;
				}
			}
			count += previousCounts[(int) number];
			previousCounts[i] = count;
			
			if (count > maxCount) {
				maxCount = count;
				maxStartingNumber = i;
			}
		}

		System.out.println(maxStartingNumber);
		
	}
}
