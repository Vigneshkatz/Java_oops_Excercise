package oops;

public class ImpSuper1 extends UsingSuper1{


//    public ImpSuper1(){
////        System.out.println("Inside ImpSuper1");
//    }
    void hello()
    {
        super.hello("using sub class to access super class");
    }
    public static void main(String[] args)
    {
        ImpSuper1 i = new ImpSuper1();
        i.hello();
        i.hello("directly accessing super class");

    }
}
