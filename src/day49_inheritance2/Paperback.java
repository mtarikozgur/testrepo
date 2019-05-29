package day49_inheritance2;

public class Paperback extends Book {

	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Paperback [pages=" + pages + "title=" + getTitle() + "title=" + getTitle() + "price=" + getPrice() + "]";
	}
	
	
	
}
