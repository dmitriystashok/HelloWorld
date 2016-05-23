/**
 * Created by Dmytro_Stashok on 5/11/2016.
 */
public class Arrays {
    public static void main(String[] args) {
        int number = 5;                  //примитивный тип
        int[] numbers = new int[6];     // Create an Array with empty cells
        //numbers[0] = 15;
        //numbers[1] = 25;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i*6;
        }

        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

            int [] numbers1 = {1,2,3,7,8,9};        // Create an Array with defined data
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }


        System.out.println();

        //Многомерный массив
        int ni = 4;
        int nj = 3;

        int[][] numbers2 = new int[][]{
                {1,2,3},
                {6,5,4},
                {7,8,9},
                {10,11,12}
        };
        for (int i = 0; i < ni; i++) {
            for (int j = 0; j < nj; j++) {
                System.out.print(numbers2[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
