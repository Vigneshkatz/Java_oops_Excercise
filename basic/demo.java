package basic;

public class demo {
    public static void main(String[] args)
    {
        int[] i = {1,2,3};
        for(int j = 0 ;j <i.length;j++)
        {
            if(j == 1)
            {
                j++;
                System.out.println(j);
                break;
            }else {
                System.out.println(i[j]);
            }
        }
        Integer s = null;
        System.out.println(null instanceof Integer);
    }
}
