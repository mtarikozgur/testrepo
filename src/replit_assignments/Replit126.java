package replit_assignments;

import java.util.*;

public class Replit126 {

	public static void main(String[] args) {

		
		
		
		
		
		int[] outer = { 1, 2, 4, 6 };
		int[] inner = { 1, 2, 4 };

		
		boolean hasTheNumbers = true;
		
		
		for(int i = 0; i < inner.length; i++) {
			
			if(Arrays.binarySearch(outer, inner[i]) < 0) {
				
				 hasTheNumbers = false;
				
			}
			
			
		}
		
		System.out.println(hasTheNumbers);
		
		
		
		
		
		
		
		/* for (int i = 0; i < outer.length; i++) {
			
			for (int j = 0; j < inner.length; j++) {
				if (outer[i] != inner[j]) {
					System.out.println(false);
					System.exit(0);
				}

			}
			
		}

		System.exit(0);
		System.out.println(true); */

	}

}
