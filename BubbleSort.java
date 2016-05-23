/**
 * Created by Dmytro_Stashok on 5/23/2016.
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] a = {2,5,3,0,1,4};
        BubbleSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
    }


    public static void sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
}
