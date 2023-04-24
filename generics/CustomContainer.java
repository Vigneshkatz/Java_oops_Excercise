package generics;

import java.util.ArrayList;

public class CustomContainer <T>{

    private ArrayList<T> a = new ArrayList<>();
    void addInput(T input)
    {
        a.add(input);
    }
    void print(){
       for(int i =0;i< a.size();i++)
       {
           System.out.println(a.get(i)+" ");
       }
    }

}
