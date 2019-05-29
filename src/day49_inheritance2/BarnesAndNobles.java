package day49_inheritance2;

public class BarnesAndNobles {

	public static void main(String[] args) {

		EBook ebook1 = new EBook();
		ebook1.setTitle("Intro to Java"); // Setting the book's title via the inherited setter from the Book class
		ebook1.setAuthor("Savitch");
		ebook1.setPages(1016);
		ebook1.setPrice(170.0);
		ebook1.setSize(500);
		ebook1.setType("Tech Book");
		
		ebook1.readEBook(24);
		
		
		AudioBook abook1 = new AudioBook();
		
		abook1.setTitle("Intro to Selenium"); 
		abook1.setAuthor("Bob");
		abook1.setNarrator("Murodil");
		abook1.setPrice(636.0);
		abook1.setType("Tech Book");

		abook1.listen();
		
		Paperback pb1 = new Paperback();
		
		pb1.setTitle("Outliers"); 
		pb1.setAuthor("Malcolm Gladwell");
		pb1.setPages(199);
		pb1.setPrice(20.0);
		pb1.setType("Biography");
		
		System.out.println(pb1.toString());
		
	}

}
