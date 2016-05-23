/**
 * Created by Dmytro_Stashok on 3/24/2016.
 * to calculate minimum from 3 numbers
 */
public class Minimum {
    public static int min(int a, int b, int c)
    {
        int m1; int m2;
        if (a<b)
            m1=a;
        else
            m1=b;
        if (m1<c)
            m2=m1;
        else
            m2=c;
        return m2;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}
