package day27_arrays_five;

import java.util.*;

public class Times {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int[] time1 = new int[2];
		int[] time2 = new int[2];
		
		// hours: 0 - 23
		// minutes: 0 - 59
		
		System.out.println("Enter time 1 hours: ");
		time1[0] = s.nextInt();
		
		System.out.println("Enter time 1 minutes: ");
		time1[1] = s.nextInt();
		
		System.out.println("Enter time 2 hours: ");
		time2[0] = s.nextInt();
		
		System.out.println("Enter time 2 minutes: ");
		time2[1] = s.nextInt();
		
		
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Invalid");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Invalid");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Invalid");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 59) {
			System.out.println("Invalid");
			return;
		}
		
		if(time1[0] < time2[0]) System.out.println("Time 1 is earlier");
		
		else if(time1[0] > time2[0]) System.out.println("Time 2 is earlier");
		
		else {
			
			if(time1[1] < time2[1]) System.out.println("Time 1 is earlier");
			
			else if(time1[1] > time2[1]) System.out.println("Time 2 is earlier");
			
			else System.out.println("Times are equal");
			
		}
	}

}
