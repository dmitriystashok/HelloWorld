/**
 * Created by Dmytro_Stashok on 3/23/2016.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream  fileInputStream = new FileInputStream("D:\\DimaS\\Data.txt");
        FileOutputStream  fileOutputStream = new FileOutputStream("D:\\DimaS\\Result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
