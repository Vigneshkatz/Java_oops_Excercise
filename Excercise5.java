/*
Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection
*/
import java.io.*;
import java.util.*;
class Book{

	String title;
	String author;
	int ISBN;

	public Book(String title,String author,int ISBN)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}

	public void getDetails() {
		System.out.println("The title is "+this.title+" written by "+this.author+" with ISNB "+this.ISBN);
	}
}

class BookCollection{
	private List<Book> collection = new ArrayList<Book>();
	
	void addBook(String title,String author, int ISBN){
	
		Book b = new Book(title,author,ISBN);
		collection.add(b);
	}
	void deleteBook(int ISBN)
	{

		Iterator<Book> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Book b = iterator.next();
			if (b.ISBN == ISBN) {
				iterator.remove();
				System.out.println("Book successfully removed");
				return;
			}
		}
		System.out.println("Book with ISBN " + ISBN + " not found");


	}
	void printBook(){
		for(Book b : collection)
		{
			b.getDetails();
		}
	}
}

class Excercise5{
	public static void main(String[] args)
	{
		BookCollection lib = new BookCollection();

		lib.addBook("The 27 year Old milliniore","vignesh",101010);
		lib.printBook();
		lib.deleteBook(101010);
	}
}

