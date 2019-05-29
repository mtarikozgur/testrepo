package day30_methods2;

import java.util.*;

public class MethodWithInput {

	public static void main(String[] args) {

		study("Java");
		study("HTML");
		sleep(5);
		
	}
	
	public static void study(String topic) { // "Java"/"HTML" is assigned to the variable called topic.
		
		System.out.println("Student is studying " + topic);
		
	}
	
	public static void sleep(int hours) {
		
		System.out.println("Student is sleeping for " + hours + " hours");
		
	}

}
