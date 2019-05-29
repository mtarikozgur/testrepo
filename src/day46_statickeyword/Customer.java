package day46_statickeyword;

public class Customer {

	private String name;
	private String email;

	static int count = 0; // Shared by all objects. There is one central copy of the variable.

	public Customer(String name, String email) {

		setName(name);
		setEmail(email);
		count++;
		
	}

	public Customer() {

		name = "undefined";
		email = "undefined";
		count++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// public static void main(String[] args) {
	// TODO Auto-generated method stub

	// }

}
