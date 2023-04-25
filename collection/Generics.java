package collection;

import java.util.ArrayList;

class A{

    public A(){
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(1);
        i.remove(0);
        for(int j : i)
        {
            System.out.println(j);
        }
    }
}
class B extends A{
    public  B(){
        ArrayList<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(2);
//        i.remove(0);
        for(int j : i)
        {
            System.out.println(j);
        }
    }
}
public class Generics {

    public static void main(String[] args)
    {
        B b = new B();
    }
}
