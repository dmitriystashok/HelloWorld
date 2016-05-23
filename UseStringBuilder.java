public class UseStringBuilder {
    public static void main(String[] args) {
        //Will not change String
        String a = "hello";
        a.toUpperCase();
        System.out.println(a);

        //Upper case will be applied
        String b = "hi there";
        b = b.toUpperCase();
        System.out.println(b);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        //Add value to String
        sb.append(" my");
        sb.append(" friend");
        //or use this
        //sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
