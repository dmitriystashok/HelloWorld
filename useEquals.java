/**
 * Created by Dmytro_Stashok on 3/25/2016.
 */
public class useEquals {
    public static void main(String[] args) {
        Check("Java");
        Check("Python");
    }
    public static void Check(String s){
        if(s.equals("Java"))
            System.out.println("Congratulate! You have chosen Java as programming language!");
        else
            System.out.println("You have chosen " +s+ " as programming language!");
    }
}
