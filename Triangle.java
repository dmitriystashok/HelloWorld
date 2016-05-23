/**
 * Created by Dmytro_Stashok on 3/25/2016.
 */
public class Triangle {
    public static void main(String[] args) {
        countTriangle(3,2,7);
    }
    public static void countTriangle(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a)
            System.out.println("This is triangle");
        else
            System.out.println("This is not triangle");
    }
}
