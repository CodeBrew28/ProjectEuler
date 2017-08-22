public class SmallestMultiple {

    private static int[] toCheck = {11, 13, 14, 16, 17, 18, 19};
    private static int minimum = 2520;

    // is better, is fixed, by Kyle :)
    public static int smallestMultiple(int step) {
        int curr = minimum;
        while(true) {
            boolean one_way_flag = true;
            for (int check : toCheck) {
                if (curr % check != 0) {
                    one_way_flag = false;
                }
            }
            if (one_way_flag) {
                return curr;
            }
            else {
                curr += step;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(smallestMultiple(20));
    }

}

