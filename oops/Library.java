package oops;

import java.util.ArrayList;

/*Create a Java program that simulates a library system.
You will need to create three classes: Book, Library, and User.*/
/*The Library class should have the following attributes:
name (String)
books (ArrayList of Book objects)
It should also have the following methods:

getters and setters for all attributes
a toString() method that returns a string representation of the library object
a checkoutBook() method that takes a book title as a parameter,
 finds the book object in the books ArrayList, and calls its checkout() method.
 If the checkout() method returns true, it should print a message saying that the book has been checked out,
 otherwise it should print a message saying that the book is already checked out or not found.

a returnBook() method that takes a book title as a parameter,
 finds the book object in the books ArrayList, and sets its availability to true.
  It should print a message saying that the book has been returned.*/

public class Library {

    private final String name = "Katz Read House";
    private ArrayList<Book> book=new ArrayList<>();

    public void addBook(Book b)
    {
        book.add(b);
        System.out.println(b.getTitle()+" is added");

    }
    public Book checkoutBook(String title)
    {
        for(Book b : book)
        {
            if( b.getTitle().equals(title) && b.getAvailability())
                System.out.println(b.toString());
        }
        return null;
    }
    public void returnBook(String title){
        for(Book check : book)
        {
            if(check.getTitle() == title )
            {
                check.setAvailability(true);
                System.out.println( "Book Sucessfully Returned");
            }
        }
    }

    public void checkBook()
    {
        for(Book b : book)
        {
            if(b.getAvailability())
                System.out.println(b.toString());
        }
    }
}
