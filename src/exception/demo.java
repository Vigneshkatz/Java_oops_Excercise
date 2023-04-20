package exception;
class Myexception extends Exception{
    public Myexception(String s)
    {
    	super(s);
        System.out.println(s);
        
    }
}
public class demo {

	public static void main(String[] args) {
        int i = 0;
        int j =5;
        try{
            int c = i/j;
            if(c==0)
            {
                throw new Myexception("the value is zero");
            }
        }
        catch (Myexception e) {
            System.out.println("cannot divide "+ i +" by "+j);
            System.out.println(e);
        }
    }
}






