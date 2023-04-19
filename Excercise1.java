/*Write a Java program to create a class called "Person" 
with a name and age attribute. 
Create two instances of the "Person" class, 
set their attributes using the constructor, 
and print their name and age.*/

class Person{
  String name;
  int age;
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }
  public void details(){
    System.out.print(this.name+" "+this.age);
  }
}
class Excercise1{
  public static void main(String[] args)
  {
    Person p = new Person("vignesh",23);
    p.details();
    
  }
}
