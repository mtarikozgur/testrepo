package day31_methods3;

public class Authentication {

	public static void main(String[] args) {

		login("eafef","wafwf");
		login("mentoring@cybertekschool.com","mentor001");
		
	}

	public static void login(String username, String password) {

		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";

		if (username.contentEquals(validUsername) && password.contentEquals(validPassword)) {

			System.out.println("Login sucessful, welcome to Okta.");

		} else {

			System.out.println("Sign in failed.");

		}

	}

}
