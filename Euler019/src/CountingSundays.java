
public class CountingSundays {

	static int firstMonthSundays = 0;

	public static void checkDay(int day) {
		if (day == 6) {
			firstMonthSundays++;
		}
	}
	
	public static void main(String[] args) {
		int year = 1901;
		int day = 1;
		
		while (year < 2001) {

			day = (day + 31%7) %7;
			checkDay(day);

			if (year % 1000 == 0) {
				if (year % 400 == 0) {
					day = (day + 29%7) %7;
					checkDay(day);
				} else {
					day = (day + 28%7) %7;
					checkDay(day);
				}
			} else if (year % 4 == 0 ){ 
				day = (day + 29%7) %7;
				checkDay(day);
			} else {
				day = (day + 28%7) %7;
				checkDay(day);
			}
			
			day = (day + 31%7) %7;
			checkDay(day);
			
			day = (day + 30%7) %7;
			checkDay(day);
			
			day = (day + 31%7) %7;
			checkDay(day);
			
			day = (day + 30%7) %7;
			checkDay(day);

			day = (day + 31%7) %7;
			checkDay(day);

			day = (day + 31%7) %7;
			checkDay(day);

			day = (day + 30%7) %7;
			checkDay(day);

			day = (day + 31%7) %7;
			checkDay(day);
			
			day = (day + 30%7) %7;
			checkDay(day);
			
			day = (day + 31%7) %7;
			checkDay(day);

			year++;
		}
		
		System.out.println(firstMonthSundays);
		
	}
	
}
