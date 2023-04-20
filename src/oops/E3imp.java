package oops;

public class E3imp {

	public static void main(String[] args) {
	
		E2book book = new E2book();
		book.setTitle("The present");
		book.setQuantity(5);
		book.setBook_price(250);
		E3author author = new E3author();
		author.setEmail("iamkatz08@gmail.com");
		author.setGender('M');
		author.setName("vignesh");
		book.author = author;
		book.author.getAuthorDetails();
		book.getBookDetails();
	}

}
