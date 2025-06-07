package Day10;

public class maxsumkadane {
    public static void main(String args[]) {
        int numbers[] = {-5, -2, -3, -4}; // Try with negative only
        kadane(numbers);
    }

    public static void kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        boolean allNegative = true;

        // Check if all numbers are negative
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            // If all are negative, return the maximum (least negative)
            for (int i = 0; i < numbers.length; i++) {
                ms = Math.max(ms, numbers[i]);
            }
            System.out.println("All elements are negative. Max (least negative) = " + ms);
        } else {
            // Apply normal Kadane’s algorithm
            for (int i = 0; i < numbers.length; i++) {
                cs += numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            System.out.println("MaxSum of the SubArray is : " + ms);
        }
    }
}
