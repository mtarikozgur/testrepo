package day44_moreconstructors;

public class Job {

	private String title;
	private String company;
	private double annualSalary;
	
	public Job() { // Constructor with 0 parameters
		
		this.title = "undefined";
		this.company = "undefined";
		
	}
	
	public Job(String title) { // Constructor with 1 parameter
		
		this.title = title;
		this.company = "undefined";
		
	}
	
	public Job(String title, String company, double annualSalary) { // Constructor with 3 parameters
		
		setTitle(title);
		setCompany(company);
		this.annualSalary = annualSalary;
		
	}
	
	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	
}
