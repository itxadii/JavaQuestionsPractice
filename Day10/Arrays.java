package Day10;

public class Arrays {
    public static void main(String args[]) {
        int numbers[] = {7, 9, 6, 2, 8, 4, 3};
        PrintSum(numbers);
    }

    public static void PrintSum(int numbers[]) {
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {  // Start j from i
                CurrSum = 0;
                for(int k=i; k<=j; k++) {  // Use i and j directly
                    CurrSum += numbers[k];
                }
                System.out.println("Sum from index " + i + " to " + j + ": " + CurrSum);
                if(MaxSum < CurrSum) {
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("The max sum is: " + MaxSum);
    }
}