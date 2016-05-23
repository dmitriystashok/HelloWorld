
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,12,15},
                          {2,5},
                          {3,6,9}
        };
        System.out.println(matrix[1][1]);
        System.out.println(matrix[2][0]);
        System.out.println( );


        String[][] strings = new String[2][3];
        strings[0][2] = "Say Hello";
        System.out.println(strings[0][2]);
        System.out.println();


        int[][] matrix1 = {{1,4,7,12,19,50},
                {2,5,18,25},
                {3,6,9,40,70}
        };
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
