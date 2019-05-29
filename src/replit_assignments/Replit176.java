package replit_assignments;

public class Replit176 {

	public static void main(String[] args) {

		int[] ints = {5,7,2,6,9,8};
		double[] doubles = {5.8,7.3,2.9,6.9,9.2,8.0};
		
		System.out.println(findMax(ints));
		System.out.println(findMax(doubles));

	}

	
	public static int findMax(int[] nums) {
	  
	  int max = Integer.MIN_VALUE;
	  
	  for(int num: nums) {
	    
	    if(num > max) max = num;
	    
	  }
	  
	  return max;
	  
	}
	
	public static double findMax(double[] nums) {
	  
	  double max = Double.MIN_VALUE;
	  
	  for(double num: nums) {
	    
	    if(num > max) max = num;
	    
	  }
	  
	  return max;
	  
	}

}
