
public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "my ";
        strings[1] = "name ";
        strings[2] = "is ";
        System.out.println(strings[0]+strings[1]+strings[2]);

        // The same but using for
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
        System.out.println();

        //Using for each cycle
        for(String i:strings){
            System.out.print(i);
        }

        System.out.println();

        int[] numbers = {1,5,9};
        int sum = 0;
        for(int x:numbers){
            sum = sum+x;
        }
        System.out.println(sum);

        int[] values = {7,8,9};
        for(int x:values){
            System.out.println(x + " bootles of rom");
        }
    }
}
