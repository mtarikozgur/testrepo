package day22_loops_more_review;

public class SearchSentence {

	public static void main(String[] args) {

		String str = "I am learing java programming. Java is fun. ";
		int count = 0;
		
		str = str.toLowerCase().replace("java","$");
	    
	    
	    for (int i = 0; i < str.length(); i++){
	      
	      if (str.charAt(i) == '$') count++;
	      
	    }
	    
	    System.out.print(count);
		
		
	}

}
