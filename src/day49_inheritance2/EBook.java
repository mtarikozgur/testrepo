package day49_inheritance2;

public class EBook extends Book {

	private double size;
	private int pages;
	
	public void readEBook(int pageNum) {
		
		// We use getTitle() and getAuthor() because "title" and "author" are private fields in the parent class.
		System.out.println("Reading " + getTitle() + " by " + getAuthor() + " to page " + pageNum); 
		
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
}
