package replit_assignments;

import java.util.*;

public class Replit168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	}

	  public static String coverString(String main, String coverME) {
	    
	    if(!main.contains(coverME)) return ("[" + main + "]");
	    
	    return main.replace(coverME, ("[" + coverME + "]"));
	    
	  }
	
}
