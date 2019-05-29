package day34_methods6;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayTwo = {6,7,8,5,6,7,6};
		
		System.out.println(findOccurences(new int[] {4,5,6,7,8,6,5,4},6));
		// System.out.println(findOccurences(arrayTwo,7));
		
		int numOfOccurances = findOccurences(arrayTwo,7);
		
		System.out.println(numOfOccurances);
		
		if(numOfOccurances > 5) {
			System.out.println("Number appears more than 5 times");
		} else {
			System.out.println("Number appears less than 5 times");
		}
		
	}

	public static int findOccurences(int[] array, int value) {
		
		int count = 0;
		
		for(int num: array) {
			
			if(num == value) count++;
			
		}
		
		return count;
		
	}
	
}
