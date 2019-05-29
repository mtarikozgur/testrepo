package day40_customclasses_methods;

public class Company {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 120000.00;
		
		// If these methods were static we could call them via Employee.work(), for example, using the class instead of the object
		
		emp1.work();
		emp1.goToBreak();
		emp1.attendMeeting();
		emp1.introduce();

	}

}
