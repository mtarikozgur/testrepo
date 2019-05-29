package day22_loops_more_review;

public class FindHowManyWithReplace {

	public static void main(String[] args) {

		String word = "including webpages, images";
		
		int count = word.length() - word.replace("e", "").length();
		
		System.out.println(count);
		
		
		
		
	}

}
