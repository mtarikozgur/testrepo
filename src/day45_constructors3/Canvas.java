package day45_constructors3;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setName("Java");
		
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Murodil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");
		
		course1.setTeachers(teachers); // Sets the teachers arraylist field in course1 object
		
		List<String> students = new ArrayList<>();
		students.add("Bob");
		students.add("Rob");
		students.add("Gene");
		students.add("Bill");
		
		course1.setStudents(students); // Don't forget to set the course1 arraylist field to an arraylist value
		
		course1.addTeacher("Maria");
		course1.addStudent("Jack");
		
		if(course1.getTeachers().contains("Maria")) { // Gets the teachers arraylist field and checks if it contains "Maria"
			System.out.println("Maria is a teacher");
		} else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Jack")) { // Gets the students arraylist field and checks if it contains "Jack"
			System.out.println("Jack is a student");
		} else {
			System.out.println("Jack is not a student");
		}
		
		course1.removeTeacher("Maria");
		course1.removeStudent("Jack");
		
		System.out.println(course1.toString());
		
	}

}
