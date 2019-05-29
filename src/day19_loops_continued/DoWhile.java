package day19_loops_continued;

import java.util.*;


public class DoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
			} while(i < 10);
		
		int n = 0;
		int total = 0;	
		
		do {
			
			total = total + n;
			n++;
			
			} while(n < 6);
		
		System.out.println("Total: " + total);
		
	}

}
