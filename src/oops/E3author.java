package oops;

public class E3author {
	/* Create a class Author. Another class Book should contain the object of the class Author as its data member.
	 * The following are the data members of the Author class – author_name, email id, and gender.
	 * Also, create appropriate constructors for this class. 
	 * Likewise, the Book class contains these methods – book_title, author (object of the Author class), book_price, and quantity_in_stock.
	 * It should also contain constructors, getter, and setter methods. 
	 * Further, create another class that contains the main() method. 
	 * Display the details of the Book in the main() method.*/
	private String name;
	private String email;
	private char gender;
	public E3author() {
		
	}
	public E3author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void getAuthorDetails() {
		System.out.println(getName());
		System.out.println(getEmail());
		System.out.println(getGender());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
