package oops;
class Animals {
    public void speak() {
        System.out.println("Animal is speaking");
    }
}

class Dogs extends Animals {
    public void speak() {
        System.out.println("Dog is barking");
    }
}


public class Downcasting{
    public static void main(String[] args)
    {
        Animals a = new Dogs();
        a.speak();
        System.out.println(a instanceof Dogs);

    }
}
