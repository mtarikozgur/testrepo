package day46_statickeyword;

public class Restaurant {

	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner Kid = new Dinner();
		Dinner Dad = new Dinner();

		System.out.println("Number of slices left: " + Dinner.pizzaSlices);
		
		Dad.takeASlice();
		Mom.takeASlice();
		Kid.takeASlice();
		
		System.out.println("Number of slices left: " + Dinner.pizzaSlices);
		
		Kid.takeASlice(3);
		Dad.takeASlice(2);
		
		System.out.println("Kid has taken this many slices: " + Kid.slicesTaken);
		System.out.println("Mom has taken this many slices: " + Mom.slicesTaken);
		System.out.println("Dad has taken this many slices: " + Dad.slicesTaken);
		System.out.println("Number of slices left: " + Dinner.pizzaSlices);
		
		
	}

}
