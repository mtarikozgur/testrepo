package day27_arrays_five;

import java.util.*;

public class CopyOf {

	public static void main(String[] args) {

		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1; // Tells d2 to point to the same object in heap memory as d1
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 1000.3; // Since both arrays point to the same object in heap memory, this will change both d1[0] AND d2[0]
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 4000;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		
		
		double[] d3 = Arrays.copyOf(d2, d2.length); // Copies everything from the d2 array and assign it to a new array, d3
		
		d2[0] = 1; // Does not affect the value of d3, since d3 points to a different array in memory
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		
	}

}
