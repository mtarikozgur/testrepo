package day13_terniary_strings;

public class MoreTerniary {

	public static void main(String[] args) {

		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating: " + rating);
		
		int PMHour = 6;
		// Rush hour during 4pm - 7pm
		boolean rushHour = PMHour <= 7 && PMHour >= 4 ? true : false;
		
		String result = rushHour ? "Yes" : "No";
		
		// System.out.println(rushHour);
		
		
		
	}

}
