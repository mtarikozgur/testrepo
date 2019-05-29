package day39_arraylists4;

public class School {

	public static void main(String[] args) {

		Student student = new Student(); // Since the Student class is in the same package we dont need to import anything
		student.name = "Roman";
		student.age = 25;
		student.subject = "Java";
		
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("Subject: " + student.subject);
		
		
		Student student2 = new Student();
		
		student2.age = 45;
		student2.subject = "Selenium";
		
		System.out.println("Name: " + student2.name); // Prints null since student2.name was never assigned
		System.out.println("Age: " + student2.age);
		System.out.println("Subject: " + student2.subject);
		
	}

}
