package oops;

import java.util.ArrayList;

/*
* The User class should have the following attributes:
name (String)
checkedOutBooks (ArrayList of Book objects)
It should also have the following methods:

    getters and setters for all attributes
a toString() method that returns a string representation of the user object
a checkoutBook() method that takes a book title as a parameter, calls the library's checkoutBook() method,
*  and adds the book to the user's checkedOutBooks ArrayList if it is successfully checked out.
a returnBook() method that takes a book title as a parameter, calls the library's returnBook() method,
* and removes the book from the user's checkedOutBooks ArrayList if it is successfully returned.*/
public class User {
    private String name;
    private Library lib = new Library();
    private ArrayList<Book> checkedOutBooks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }

    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(ArrayList<Book> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    public String toString(){
        String out = this.name+" has this book ";
        for(Book b : checkedOutBooks)
        {
            out+=b.getTitle();
        }
        return out;
    }

    public void checkoutBook(String title){

        if(lib.checkoutBook(title) != null) {
            checkedOutBooks.add(lib.checkoutBook(title));
        }
    }
    public void returnBook(String title)
    {
        lib.returnBook(title);
        int count = 0;
        for(Book b : checkedOutBooks)
        {
            if(b.getTitle() == title)
            {
                checkedOutBooks.remove(count);
            }
            count++;
        }
    }
}
