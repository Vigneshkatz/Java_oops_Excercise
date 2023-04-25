package generics;

import java.util.ArrayList;

class Generic <T extends Number> {
    private ArrayList<T> list = new ArrayList<>();
    void addInput(T i)
    {
        list.add(i);
    }
    void print()
    {
       for(int i = 0; i < list.size() ; i++)
       {
           System.out.println(list.get(i));
       }
    }

}

//Bounded generics
class GenericExtends <T extends Number> {

//    this get only type T which is a Numbers only
private ArrayList<T> list = new ArrayList<>();
    void addInput(T i)
    {
        list.add(i);
    }
    void print()
    {
        for(int i = 0; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }
}

public class GenericDemo{
    public static void main(String[] args)
    {
        Generic<Integer> g1 = new Generic();
        g1.addInput(33);g1.addInput(23);g1.addInput(22);
        g1.print();
//        Generic<String> g2 = new Generic<>();
//        g2.addInput("hello");g2.addInput("hji");g2.addInput("hdscn");
//        g2.print();
        GenericExtends<Integer> g3 =new GenericExtends<>();
        g3.addInput(55);
        g3.addInput(77);
//        GenericExtends<String> g4 = new GenericExtends<String>();
//        this is not support as it extends Nnumber this type is a Bounded generic;
        String s = "hello";
        StringBuilder i = new StringBuilder("hi");
        i.append(5);
        System.out.println(i);
        ArrayList<Integer> ahb = new ArrayList<>();
        System.out.println(ahb.size());
    }
}
