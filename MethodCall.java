/**
 * Created by Dmytro_Stashok on 3/24/2016.
 */
public class MethodCall
{
    public static void main(String[] args)
    {

        System.out.println("Minimum is "+ min(5, 7));
    }

    public static int min(int a, int b)
    {

        if (a < b)
            return a;
        else
            return b;

    }
}
