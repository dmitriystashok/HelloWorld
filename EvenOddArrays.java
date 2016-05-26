import java.util.ArrayList;

public class EvenOddArrays {
    public static void main(String[] args) {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        ArrayList<Integer> even = new ArrayList<>();  //четные
        ArrayList<Integer> odd = new ArrayList<>();  //нечетные

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0 )
                even.add(x);
            else
                odd.add(x);
        }
        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i));
        }
        System.out.println();

        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }
    }
}
