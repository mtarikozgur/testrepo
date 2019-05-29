package day51_overriding2;

public class JuiJistsu extends Exercise {

	@Override
	public int perform(int minutes) {

		System.out.println("Doing jjs exercise: " + (minutes * 12) + " calories burned.");
		return minutes * 12;

	}
	
}
