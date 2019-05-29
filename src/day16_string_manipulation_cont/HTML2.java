package day16_string_manipulation_cont;

import java.util.*;

public class HTML2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
      int first = html.indexOf("id=");
      int second = html.indexOf("\">", first);
      String result = html.substring(first+4, second);
      
      if(html.contains("<html>")){
        System.out.print(result);
        
      }else{
        System.out.print("Invalid input!");
        
      }
      
		
      // <!DOCTYPE html><html><head><title>Coding is a POWER</title></head><body><div class="container"><a href="http://www.fb.com" id="fb">Clicki Here!</a></div></body></html>
      
	}

}
