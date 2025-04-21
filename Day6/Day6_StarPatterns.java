package Day6;

public class Day6_StarPatterns {
    public static void main(String args[]) {
        // for(int line=1;line<=n;line++){
        // for(int star=1;star<=line;star++){
		// System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int line=1;line<=n;line++){
        // for(int star=1;star<=(n-line+1);star++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
