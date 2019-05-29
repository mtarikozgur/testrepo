package day27_arrays_five;

import java.util.Arrays;

public class SplitURL {

	public static void main(String[] args) {

		String url = "https://learn.cybertekschool.com/courses/147";
		
		String[] parts = url.split("/");
		
		int threeDigits = Integer.parseInt(parts[parts.length-1]);
		
		System.out.println(Arrays.toString(parts));
		
		switch(threeDigits) {
		
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		
		}
		
	}

}
