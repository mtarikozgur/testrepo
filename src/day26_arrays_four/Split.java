package day26_arrays_four;

public class Split {

	public static void main(String[] args) {

		String words = "java,kava,bava,hava";
		
		String list[] = words.split(",");
		
		String diceResult = "1 - 20 of 1461 positions";
		
		String results[] = diceResult.split(" ");
		
		for(String result: results) {
			
			if(result.contentEquals("1461")) System.out.println(result);
			
		}
		
		String sentence = "I felt happy because I saw that others were happy";
		
		String[] allWords = sentence.split(" "); 
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
		
	}

}
