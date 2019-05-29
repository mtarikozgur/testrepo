package day47_staticimports;

import java.util.*;

import static java.lang.Math.*; // java.lang.* does not work
import static java.lang.Character.*;
import static java.util.Arrays.sort;

public class StaticImports {

	public static void main(String[] args) {

		System.out.println(PI); // We do not have to say Math.PI
		System.out.println(max(10,5));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(isDigit('4')); // We can use this from java.lang.Character static import
		System.out.println(isAlphabetic('a'));
		
		int[] nums = {5,1,3,7,9};
		sort(nums);
		
		System.out.println(Arrays.toString(nums)); // We can use this from regular import

	}

}
