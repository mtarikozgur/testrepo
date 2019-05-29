package day15_string_manipulation;

public class IndexOf {

	public static void main(String[] args) {

		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("hub"));
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		
		System.out.println("Position of . :" + index);
		
		System.out.println(url.charAt(index+1));
		
		
		String title = "Java - Google Search";
		
		int dash = title.indexOf("-");
		System.out.println(title.charAt(dash - 1));
		System.out.println(title.charAt(dash + 1));
		
	}

}
