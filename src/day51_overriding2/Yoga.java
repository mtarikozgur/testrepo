package day51_overriding2;

public class Yoga extends Exercise{

	@Override
	public int perform(int minutes) {

		System.out.println("Doing yoga exercise: " + (minutes * 5) + " calories burned.");
		return minutes * 5;

	}
	
}
