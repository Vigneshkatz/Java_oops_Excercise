package oops;

public class Libimplementation {
    /*
    * You can create a Library object, add some Book objects to its books ArrayList, and create some User objects.
    * Then, you can call the methods on the Library and User objects to simulate checking out and returning books.*/
    public static void main(String[]  args)
    {
        Library lib = new Library();
        Book b1 = new Book("Think and Grow Rich","Nepolean hill",2016,true);
        Book b2 = new Book("The psychology of money","Cal newport Morgan house",2012,true);
        Book b3 = new Book("The psychology of selling ","Brayan tracy",2000,true);
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.checkBook();
        User user = new User();
        user.setName("Vignesh");
        user.checkoutBook("The psychology of money");
    }
}
