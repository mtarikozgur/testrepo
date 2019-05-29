package day48_inheritance;

public class School {

	public static void main(String[] args) {

		Person person1 = new Person(); 
		Student student1 = new Student();
		
		person1.name = "Obama";
		person1.age = 57;
		person1.gender = 'm';
		
		student1.name = "Roman";
		student1.age = 30;
		student1.gender = 'm';
		
		person1.eat("steak");
		student1.eat("soup");
		
		person1.walk();
		student1.walk();

		Student student2 = new Student();
		
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.studentClass = "Agile Scrum";
		
		student2.code("Java");
		student2.attendClass();
		student2.eat("Kebab");
		
	}

}
