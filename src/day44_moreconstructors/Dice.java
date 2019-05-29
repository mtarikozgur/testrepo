package day44_moreconstructors;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("Java Developer", "Amazon", 130000.00);
		
		System.out.println(job1.toString()); // Uses the toString method from Job class
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		Job job4 = new Job("SDET", "Amazon", 150000.00);
		Job job5 = new Job("Janitor", "Apple", 100000.00);
		Job job6 = new Job("CEO", "Google", 1530000.00);
		Job job7 = new Job("Manager", "Verizon", 90000.00);
		Job job8 = new Job("Java Developer", "Amazon", 130000.00);
		
		List<Job> jobsList = new ArrayList<>();
		
		jobsList.add(job3);
		jobsList.add(job4);
		jobsList.add(job5);
		jobsList.add(job6);
		jobsList.add(job7);
		jobsList.add(job8);
		jobsList.add(new Job("SDET", "Freddie Mac", 122000.00));
		
		int count = 0;
		int mark = -1;
		double max = 0.0;
		
		for(int i = 0; i < jobsList.size(); i++) {
			
			if( jobsList.get(i).getAnnualSalary() > max) {
				
				max = jobsList.get(i).getAnnualSalary();
				mark = i;
				
			}
			
		}
		
		System.out.println("Highest salary" + jobsList.get(mark));
		
	}
	
}
