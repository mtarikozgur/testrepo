package day39_arraylists4;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);

		ArrayList<Double> nums2 = new ArrayList<>();
		nums2.add(10.0);
		nums2.add(10.0);
		nums2.add(7.0);
		nums2.add(8.0);
		nums2.add(8.0);
		nums2.add(3.0);
		nums2.add(4.0);
		nums2.add(8.0);

		ArrayList<String> nums3 = new ArrayList<>();
		nums3.add("810");
		nums3.add("66");
		nums3.add("89");
		nums3.add("35");
		nums3.add("7");
		nums3.add("344");
		nums3.add("127");
		nums3.add("64");

		
		printList(nums);
		System.out.println(sumList(nums2));
		System.out.println(getList(8));
		System.out.println(getRandomList(8));
		System.out.println(convertToIntList(nums3));

	}

	public static void printList(ArrayList<Integer> nums) {

		for (Integer num : nums) {

			System.out.println(num + " ");

		}

		System.out.println();

	}

	public static double sumList(List<Double> nums) {

		double sum = 0;

		for (Double num : nums) {

			sum += num;

		}

		return sum;

	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> nums2 = new ArrayList<>();

		for (int i = 1; i <= size; i++) {

			nums2.add(i);

		}

		return nums2;

	}

	public static ArrayList<Integer> getRandomList(int size) {

		Random r = new Random();
		
		ArrayList<Integer> nums3 = new ArrayList<>();

		for (int i = 1; i <= size; i++) {

			nums3.add(r.nextInt(101));

		}

		return nums3;

	}
	
	public static List<Integer> convertToIntList(List<String> numbers) {
		
		ArrayList<Integer> nums4 = new ArrayList<>();
		
		for(String number: numbers) {
			
			nums4.add(Integer.valueOf(number));
			
		}
		
		return nums4;
		
	}

}
