package day45_constructors3;
import java.util.*;
public class Course {

	private String name;
	private List<String> teachers = new ArrayList<>();
	private List<String> students = new ArrayList<>();
	
	public String toString() {

		return ("Name: " + getName() + ", teachers: " + getTeachers() + ", students: " + getStudents());

	}
	
	public void addStudent(String sname) {
		students.add(sname);
	}
	
	public void addTeacher(String tname) {
		teachers.add(tname);
	}
	
	public void removeStudent(String sname) {
		students.remove(sname);
	}
	
	public void removeTeacher(String tname) {
		teachers.remove(tname);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	
}
