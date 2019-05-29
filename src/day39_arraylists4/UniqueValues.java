package day39_arraylists4;

import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(); // Polymorphism, where the data type on the left is different than the
												// one on the right
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);

		List<Integer> uniqueNums = new ArrayList<>();

		for (int num : nums) {

			int count = 0;

			for (int n : nums) {

				if (n == num)
					count++;

			}

			if (count == 1)
				uniqueNums.add(num);

		}

		System.out.println(uniqueNums);

		List<Integer> eachNumberOnce = new ArrayList<>();

		for (int num : nums) {

			if(!eachNumberOnce.contains(num)) eachNumberOnce.add(num);
			
		}
		
		System.out.println(eachNumberOnce);

	}

}
