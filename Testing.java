import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dmytro_Stashok on 5/12/2016.
 */
public class Testing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any number from 1 to 50");
        Testing test = new Testing();
        test.odOrEven(Integer.parseInt(reader.readLine()));


    }

    public void odOrEven(int c) {
        for (int i = 1; i <= c; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Is odd number");
            } else {
                System.out.println(i + " - Is even number");
            }
        }
    }
}
