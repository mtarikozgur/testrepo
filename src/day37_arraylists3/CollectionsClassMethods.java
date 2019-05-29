package day37_arraylists3;
import java.util.*;
public class CollectionsClassMethods {

	public static void main(String[] args) {

		List<Integer> nums1 = new ArrayList<>();
		nums1.add(44);
		nums1.add(1);
		nums1.add(4);
		nums1.add(1000);
		nums1.add(3);
		
		System.out.println(nums1);

		Collections.sort(nums1); // Sorts nums1 in ascending order
		
		System.out.println(nums1);
		
		List<String> strList = new ArrayList<>();
	
		
		strList.add("Roman");
		strList.add("Orhan");
		strList.add("Elizabeth");
		
		System.out.println(strList);
		
		Collections.sort(strList);
		
		System.out.println(strList);
		
		Collections.shuffle(strList);
		
		System.out.println(strList);
		
		int maxNum = Collections.max(nums1);
		int minNum = Collections.min(nums1);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println(maxNum + " " + minNum + " " + maxName + " " + minName);
		
		
		
	}

}
