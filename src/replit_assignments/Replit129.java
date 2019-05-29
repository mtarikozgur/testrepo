package replit_assignments;

import java.util.*;

public class Replit129 {

	public static void main(String[] args) {

		// rows: 3 col: 3 112 331 444

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rwos

		// your code here

		int matches = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i][j] == arr[i][k]) {
						matches++;

					}
				}

			}
			
		}

		System.out.print("matches: " + matches);

	}

}
