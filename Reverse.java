import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        Reverse newObj = new Reverse();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        System.out.println(newObj.reverseString(reader.readLine()));

    }
    public String reverseString(String a){
        String c = new StringBuffer(a).reverse().toString();
        return c;
    }
}

