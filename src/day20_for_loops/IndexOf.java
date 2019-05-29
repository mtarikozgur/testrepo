package day20_for_loops;

public class IndexOf {

	public static void main(String[] args) {

		String word = "amazon";
		char letter = 'p';
		int index = -1;
		
		for(int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == letter) {
				
				index = i;
				
				break;
				
			}
			
		}
		
		System.out.println(index);
		
		
	}

}
