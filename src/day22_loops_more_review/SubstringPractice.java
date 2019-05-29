package day22_loops_more_review;

public class SubstringPractice {

	public static void main(String[] args) {

		String word = "java";
		
		
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		for(int n = 0; n < 4; n++) {
			
			System.out.println(word.substring(n,n+1));
			
		}
		
		for(int n = 4; n > 0; n--) {
			
			System.out.println(word.substring(n-1,n));
			
		}


		
		
	}

}
