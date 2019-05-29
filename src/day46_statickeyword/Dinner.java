package day46_statickeyword;

public class Dinner {

	public static int pizzaSlices = 8;
	
	int slicesTaken = 0;
	
	public void takeASlice() {
		
		pizzaSlices--;
		slicesTaken++;
		
	}
	
	public void takeASlice(int count) {
		
		pizzaSlices -= count;
		slicesTaken += count;
		
	}
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
