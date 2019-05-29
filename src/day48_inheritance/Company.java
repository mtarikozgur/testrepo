package day48_inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Bob";
		emp1.age = 34;
		emp1.jobTitle = "Teacher";
		emp1.gender = 'm';
		
		Employee emp2 = new Employee();
		emp2.name = "Dan";
		emp2.age = 26;
		emp2.jobTitle = "SDET";
		emp2.gender = 'm';
		
		emp1.eat("Chicken");
		emp2.eat("Cereal");
		
		emp1.walk();
		emp2.walk();
	
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
	}

}
