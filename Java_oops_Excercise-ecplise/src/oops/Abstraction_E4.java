package oops;

/*Create an interface "Database" with an abstract method "connect()".
 *  Create two classes "MySQLDatabase" and "PostgreSQLDatabase" that implement the "Database" 
 *  interface and provide their own implementation for the "connect()" method.*/
interface Database{
	void connect();
}
class MySQLDatabase implements Database{
	public void connect() {
		System.out.println("connected to MySQLDatabase");
	}
}
class PostgreSQLDatabase implements Database{
	public void connect() {
		System.out.println("connected to PostgreSQLDatabase");
	}
}
public class Abstraction_E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
