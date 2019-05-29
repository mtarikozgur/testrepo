package day19_loops_continued;

public class PrintLetters {

	public static void main(String[] args) {

		String word = "Amazon";
		int n = word.length();
		int i = 0;
		
		while(i < n) {
			System.out.println(word.charAt(i));
			i++;
		}
		
		i--;
		
		while(i >= 0) {
			System.out.println(word.charAt(i));
			i--;
		}
		
	}

}
