/*
2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values. 
*/
class Dog{
	String name;
	String breed;
	public Dog(String name,String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	public Dog(){
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getName(){
		return this.name;}
	public String getBreed(){
		return this.breed;}
}
class Excercise2{
	public static void main(String[] args)
	{
		Dog puppy = new Dog();
		Dog julie = new Dog();
		puppy.setName("puppy");
		puppy.setBreed("Aseel");
		julie.setName("julie");
		julie.setBreed("Koli");
		System.out.print(julie.getName()+" "+julie.getBreed());
		System.out.print(puppy.getName()+" "+puppy.getBreed());

	}
}
