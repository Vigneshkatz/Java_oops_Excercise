package collection;

import java.util.ArrayList;

class Parent{
    public Parent(){
        System.out.println("Inside parent");
    }
    public void branch(){
        System.out.println("I am the parent");
    }

}
class Child extends Parent{
    public Child(){
        System.out.println("Inside Child");
    }
    public void branch(){
        System.out.println("I am the child");
    }
    public void play(){
        System.out.println("i am playing");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Child child = new Child();
        Parent pC = new Child();
        Parent parent = new Parent();
//      Child cP = new Parent();
        child.branch();//i am the child
        pC.branch();//i am child
        parent.branch();//iam parent
        ((Parent)child).branch();
        ((Child) pC).play();
        ArrayList<Integer> i = new ArrayList<>();
        System.out.println(i.size());
    }
}
