package day15_string_manipulation;

import java.util.*;

public class EmojiShortcuts {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String emoji = s.next();
		
		if(emoji.length() != 2) return;
		
		switch(emoji) {
		case ":)":
			System.out.println("Smile");
			break;
		case ":(":
			System.out.println("Sad");
			break;
		case ":/":
			System.out.println("Upset");
			break;
		case ":p":
			System.out.println("Playful");
			break;
		case ";)":
			System.out.println("Wink");
			break;
		case ";0":
			System.out.println("Surprised");
			break;
		case "(:":
			System.out.println("Smile");
			break;
		case "):":
			System.out.println("Sad");
			break;
		
		
		}
		
	}

}
