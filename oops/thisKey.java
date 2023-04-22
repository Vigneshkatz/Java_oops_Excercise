package oops;
import java.util.*;
import java.lang.*;

public class thisKey {
    private String name;
    private int age;

    public thisKey(String name) {
        this(name, 0); // calling another constructor of the same class using "this"
    }

    public thisKey(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printDetails(){
        System.out.println(this.age+" "+this.name);
    }
}



