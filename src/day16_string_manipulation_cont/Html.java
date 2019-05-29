package day16_string_manipulation_cont;

import java.util.*;

public class Html {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	  
	    html = html.substring(html.indexOf("id=") + 4,html.indexOf("\"",html.indexOf("id=") + 4));
	    
	    System.out.println(html);
	    
	    
	    
	    // <!DOCTYPE html><html><head><title>Test</title></head><body><div><a href="http://www.google.com" id="linkid">Clicki Here!</a></div></body></html>
		
	}

}
