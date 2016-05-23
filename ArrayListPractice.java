import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] one = new int[5];
        System.out.println(one.length);
        //Create an ArrayList - it is dynamic
        ArrayList <String> two = new ArrayList<>();
        System.out.println(two.size());
        //Set values to ArrayList
        two.add("Everybody ");
        two.add("dance");
        two.add("now");
        System.out.println(two.size());
        //Print all elements in ArrayList
        for(String i:two){
            System.out.println(i);
        }

        System.out.println(" ");

        for (int i = 0; i < two.size(); i++) {
            System.out.println(two.get(i));
        }
        System.out.println(" ");
        //Rename value in ArrayList
        two.set(0,"C'mon, everybody");
///some changes to test GitHub
        for(String i:two){
            System.out.println(i);
        }
        System.out.println(" ");
        //Delete value in ArrayList
        two.remove(0);
        System.out.println(two.size());
        System.out.println(" ");

        for(String i:two){
            System.out.println(i);
        }

    }
}
