import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        while (true)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(reader.readLine());
            if (num != -1){
                sum = sum + num;
            }
            else {
                sum = sum -1;
                System.out.println(sum);
                break;
            }
        }
    }
}
