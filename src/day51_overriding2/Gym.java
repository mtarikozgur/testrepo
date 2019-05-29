package day51_overriding2;

public class Gym {

	public static void main(String[] args) {

		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		Sprinting sp = new Sprinting();
		Exercise sn = new Snowboarding(); // Polymorphism
		
		e.perform(45);
		s.perform(45);
		sn.perform(45); // Calls perform() in Snowboarding, which itself then calls perform() in Exercise 
		

	}

}
