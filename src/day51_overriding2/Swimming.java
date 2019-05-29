package day51_overriding2;

public class Swimming extends Exercise{
	
	@Override
	public int perform(int minutes) {

		System.out.println("Doing swimming exercise: " + (minutes * 11) + " calories burned.");
		return minutes * 11;

	}
}
