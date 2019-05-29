package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		
		boolean isBreakTime = true;
		
		if(isBreakTime == true) {
			System.out.println("Break till 8:35pm");
		} else {
			System.out.println("Not break time yet");
		}
		
		boolean classTime = true;
		
		if(classTime) { // no == operator needed here
			System.out.println("It is classtime");
		} 
		
		
		
	}

}
