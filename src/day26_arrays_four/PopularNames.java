package day26_arrays_four;

import java.util.*;

public class PopularNames {

	public static void main(String[] args) {

		String[] names = {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		System.out.println("Number of names: " + names.length);
		
		System.out.println();
		
		System.out.println(Arrays.toString(names)); // Assigns array to a string, then prints the string

		int i = 0;
		
		for(String name: names) {
			
			if(i % 2 == 0) 		System.out.print(name + ", ");
			else 		System.out.println(name);

			i++;
			
		}
		
		i = 0;
		
		for(String name: names) {
			
			if(i % 2 == 0) 		System.out.println(name + ", ");
			

			i++;
			
		}
		
		i = 0;
		
		for(String name: names) {
			
			if(i % 2 != 0) 		System.out.println(name + ", ");
			

			i++;
			
		}
		
		System.out.println();

		Random r = new Random();
		
		int ran = r.nextInt(names.length); // gives random number from 0 - 199, since names.length == 200
		
		System.out.println();

		for(String name: names) {
			
			if(name.length() >= 4) 		System.out.print(name.toUpperCase() + " ");
					
		}
		
		System.out.println();
		System.out.println();
		
		for(int j = 0; j < names.length; j+=2) {
			
			System.out.println(names[j+1] + ", " + names[j]);
			
		}
		
	}

}
