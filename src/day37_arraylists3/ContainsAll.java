package day37_arraylists3;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);
		nums1.add(50);
		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);
		nums2.add(10);
		nums2.add(40);
		nums2.add(30);
		
		// How can we test if all the values of nums2 are in nums1?
		
		if(nums1.containsAll(nums2)) System.out.println("Nums1 contains all Nums2");
		else System.out.println("Nums1 doesn't contain all Nums2");
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping-pong");
		
		List<String> planB = new ArrayList<>();
		planB.add("replit");
		planB.add("java");
		planB.add("ping-pong");
		
		if(planA.containsAll(planB) && planB.containsAll(planA)) System.out.println("Both plans match");
		else System.out.println("Both plans don't match");
		

	}

}
