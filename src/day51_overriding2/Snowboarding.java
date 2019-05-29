package day51_overriding2;

public class Snowboarding extends Exercise{

	
	public int perform(int minutes) {
		
		super.perform(minutes);
		System.out.println("Doing snowboarding exercise: " + (minutes * 7) + " calories burned.");
		return minutes*7;
		
	}
	
}
