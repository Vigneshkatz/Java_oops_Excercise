package oops;

public class E2book {
	/* Create a class Author. Another class Book should contain the object of the class Author as its data member.
	 * The following are the data members of the Author class – author_name, email id, and gender.
	 * Also, create appropriate constructors for this class. 
	 * Likewise, the Book class contains these methods – book_title, author (object of the Author class), book_price, and quantity_in_stock.
	 * It should also contain constructors, getter, and setter methods. 
	 * Further, create another class that contains the main() method. 
	 * Display the details of the Book in the main() method.*/
	E3author author;
	private String title;
	private int book_price;
	private int quantity;
	
	public E2book() {
		
	}
	public E2book(String title, int book_price, int quantity) {
		this.title = title;
		this.book_price = book_price;
		this.quantity = quantity;
	}
	public void getBookDetails() {
		System.out.println(getTitle());
		System.out.println(getBook_price());
		System.out.println(getQuantity());
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
