package Day8;

public class Day8_AdvPatterns {
	public static void main(String args[]) {
		// RecPattern(20, 20);
		InvTriangle(9);
	}

	// public static void RecPattern(int rows, int cols) {
	// 	for (int i = 1; i <= rows; i++) {
	// 		for (int j = 1; j <= cols; j++) {
	// 			//cell (i, j)
	// 			if (i == 1 || i == rows || j == 1 || j == cols) {
	// 				System.out.print("*");
	// 			} else {
	// 				System.out.print(" ");
	// 			}
	// 		}
	// 	System.out.println();
	// 	}
	// }
	public static void InvTriangle(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");

			}
			for (int j=1; j<=i; j++) {                                
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
