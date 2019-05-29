package day45_constructors3;

public class EtsyDotCom {

	public static void main(String[] args) {

		EtsyAccount acct1 = new EtsyAccount(); // Object with valid values
		acct1.setEmail("wrrr@gawgg.com");
		acct1.setFirstName("Robert");
		acct1.setPassword("fwafwa131");
		System.out.println(acct1.toString());
		
		System.out.println();
		
		EtsyAccount acct2 = new EtsyAccount(); // Object with invalid values
		acct2.setEmail("@gawgg.com");
		acct2.setFirstName("Ro2bert");
		acct2.setPassword("53");
		System.out.println(acct2.toString());
		
		System.out.println();
		
		EtsyAccount acct3 = new EtsyAccount("esfesf@gmail.com", "Jack", "4556");
		System.out.println(acct3.toString());
		
		System.out.println();
		
		EtsyAccount acct4 = new EtsyAccount("felfisnf@gmail.com", "Sally");
		System.out.println(acct4.toString());

	}

}
