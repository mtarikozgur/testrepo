package day28_fast_food;

import java.util.*;

public class FindNonDuplicate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int result = 0;
	    
	    Arrays.sort(nums);
	    
	    System.out.println(Arrays.toString(nums));
	    
	    for(int i = 0; i < nums.length-1; i+=2) {
	    	
	    	if (nums[i] == nums[i+1]) continue;
	    	
	    	else {
	    		
	    	result = nums[i];
	    	break;
	    	
	    	}
	    }
	    
	    if(result == 0) result = nums[6];
	    
	    System.out.println(result);
	    
	    
		
	}

}
