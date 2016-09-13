
import java.lang.Math;
public class SpecialPythagoreanTriplet {
	
	static public int SpecialPythagoreanTriplet(int total) {
		for (int i = 2; i < total; i++) {
			for (int j = 2; j < total; j++) {
				if (Math.sqrt(i * i + j*j) % 1 == 0) {
					if (Math.sqrt(i * i + j*j)  + i + j == total) {
						return (int) (Math.sqrt(i * i + j*j)  * i * j) ;
					}
				}
			}
		}
		return 0;
	}
	
	public static void main (String args[]) {
		System.out.println(SpecialPythagoreanTriplet(1000));
	}
	
	
}
