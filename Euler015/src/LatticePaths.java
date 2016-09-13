
public class LatticePaths {

	static long latticePaths(int gridSize ) {
	

		long paths = 1;
		for (int i = 0; i < gridSize; i++) {
		    paths = paths * ((2 * gridSize) - i);
		    paths = paths / (i + 1);
		}
		return paths;
		
		
	}
	
	
	public static void main (String args[]) {
		System.out.println(latticePaths(20));
		
	}
}
