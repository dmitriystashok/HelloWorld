/**
 * Created by Dmytro_Stashok on 3/21/2016.
 */
public class CheckOddEven {   // saved as "CheckOddEven.java"
    public static void main(String[] args) {
        CheckNumber(66);       // we call CheckNumber method and get a value 66 into it
    }
    public static void CheckNumber(int number){
        if (number % 2 == 0) { //Or it could be odd if (number % 2 != 0)
            System.out.println(number +" Is Even number");
        } else {
            System.out.println(number + " Is Odd number");
        }
    }
}

