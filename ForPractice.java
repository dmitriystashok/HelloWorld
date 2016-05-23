public class ForPractice {
    public static void main(String[] args) {
        int count = 8;

        for (int i = 1; i < count; i++) {
            for (int j = 1; j < count; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
