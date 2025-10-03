package Day10;

public class PrefixMaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {1, 4, 5, 7, 9, 11};
        maxSubarraySum(numbers);
    }
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = 0;
        int currSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // Calculate Prefix array
        for(int i = 1; i < prefix.length; i++)  {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Total Sum is = " + maxSum);
    }
}
