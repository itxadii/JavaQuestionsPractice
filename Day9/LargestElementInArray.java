package Day9;

public class LargestElementInArray {
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5};
        int largest = largestElement(numbers);
        int smallest = smallestElement(numbers);
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
    }
    public static int largestElement(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int smallestElement(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
