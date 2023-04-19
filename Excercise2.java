class Dog{
	String name;
	Strig breed;
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
		System.out.print(julie.getName+" "+Julie.getBreed);
		System.out.print(puppy.getName+" "+puppy.getBreed);

	}
}
