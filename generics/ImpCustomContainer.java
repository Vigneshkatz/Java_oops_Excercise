package generics;

public class ImpCustomContainer {
    public static void main(String[] args)
    {
        CustomContainer<Integer> i = new CustomContainer<>();
        i.addInput(67);
        i.addInput(77);
        i.addInput(88);
        i.print();
        Float j = 5.6f;

    }
}
