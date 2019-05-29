package day40_customclasses_methods;

public class MyContacts {

	public static void main(String[] args) {

		Contact contact1 = new Contact();

		contact1.name = "Evgenia Jalilova";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "evgenia@thorlabs.com";

		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();

		Contact contact2 = new Contact();

		contact2.name = "Orhan Sultanov";
		contact2.phoneNumber = "(636) 631-4780";
		contact2.email = "orhan@gmail.com";

		contact2.call();
		contact2.sendMessage();
		contact2.sendEmail();

	}

}
