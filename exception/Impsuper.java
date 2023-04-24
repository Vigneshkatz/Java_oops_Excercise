package exception;

public class Impsuper extends Usingsuper{

    Impsuper(){
        super("Inside hello");
    }
    void hello()
    {
        super.hello();
    }
    public static void main(String[] args)
    {
        Impsuper i = new Impsuper();
        i.hello();
    }
}

