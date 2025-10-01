package Day10;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {1, 4, 5, 7, 9, 11};
        maxSubarraySum(numbers);
    }
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = 0;
        int currSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += numbers[k];
                }
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Total Sum is = " + maxSum);
    }
}
