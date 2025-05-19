package Day10;

public class maxsumkadane {
    public static void main(String args[]) {
        int numbers[] = {1 ,-2 , 6, -1, 3};
        kadane(numbers);
    }
    public static void kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("MaxSum of the SubArray is : " + ms);
    }
}
