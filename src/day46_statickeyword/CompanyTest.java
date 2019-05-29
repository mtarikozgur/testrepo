package day46_statickeyword;

public class CompanyTest {

	public static void main(String[] args) {

		System.out.println(); // Notice the similarity between System.out.println(); and Company.cname.toUpperCase();
		
							  //"out" is a static variable of the PrintStream class, and println() is NOT static,
							  //since we are accessing it via a variable instead of a class.

		String name = Company.cname.toUpperCase(); // toUpperCase() is a non static method of the String class.
		
		System.out.println(name);
		
	}

}
