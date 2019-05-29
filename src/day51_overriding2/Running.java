package day51_overriding2;

public class Running extends Exercise {

	@Override
	public int perform(int minutes) {

		System.out.println("Doing running exercise: " + (minutes * 10) + " calories burned.");
		return minutes * 10;

	}

}
